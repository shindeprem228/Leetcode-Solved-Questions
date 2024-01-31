//OPTIMAL
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0 , cnt=0;
        HashMap <Integer, Integer> hm = new HashMap<>();

        hm.put(0,1);
        for(int i=0 ; i<nums.length ; i++)
        {
            sum = sum + nums[i];

            if(hm.containsKey(sum - k))
            {
                cnt = cnt + hm.get(sum - k);
            }

            if(hm.containsKey(sum))
                hm.put(sum, hm.get(sum)+1);
            else
                hm.put(sum, 1);
        }
        return cnt;
    }
}


// BRUTE
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int cnt=0 , n=nums.length, sum=0;
//         for(int i=0 ; i<n ; i++)
//         {
//             for(int j=i ; j<n ; j++)
//             {
//                 sum=0;
//                 for(int l=i ; l<=j ; l++)
//                 {
//                     sum = sum + nums[l];
//                 }
//                 if(sum == k)
//                     cnt++;
//             }
//         }
//         return cnt;
//     }
// }




// Better (me)
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int cnt=0, n=nums.length;
//         for(int i=0 ; i<n ; i++)
//         {
//             int sum=0;
//             for(int j=i ; j<n ; j++)
//             {
//                 sum = sum + nums[j];
//                 if(sum == k)
//                     cnt++;
//             }
//         }
//         return cnt;
//     }
// }