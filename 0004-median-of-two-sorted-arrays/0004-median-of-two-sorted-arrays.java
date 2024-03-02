//OPTIMAL - BINARY SEARCH
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int low = 0 , high = nums1.length , mid1 , mid2;
        while(low <= high)
        {
            mid1 = (low+high)/2;
            mid2 = ((nums1.length+nums2.length+1)/2) - mid1;
            int l1=Integer.MIN_VALUE , l2=Integer.MIN_VALUE , r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;

            if(mid1 < nums1.length)
                r1 = nums1[mid1];
            if(mid2 < nums2.length)
                r2 = nums2[mid2];
            if(mid1>0 )
                l1 = nums1[mid1-1];
            if(mid2>0)
                l2 = nums2[mid2-1];

            if(l1<=r2 && l2<=r1) 
            {
                if((nums1.length + nums2.length) %2 == 0)
                {
                    return (double)(Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }
                else
                    return Math.max(l1,l2);
            }
            else if(l1>r2)  high = mid1-1;
            else if(l2>r1)  low = mid1+1;
        }
        return 0;
    }
}

// BETTER
// class Solution {
//     public double findMedianSortedArrays(int[] n1, int[] n2) {
//         int i=0 , j=0 , cnt=0 , n1l=n1.length , n2l = n2.length;
//         int ind1 = ((n1l+n2l)/2)-1, ind2 = (n1l+n2l)/2, ind1el=-1, ind2el=-1;

//         while(i<n1l && j<n2l)
//         {
//             if(n1[i] < n2[j])
//             {
//                 if(cnt == ind1) ind1el = n1[i];
//                 if(cnt == ind2) ind2el = n1[i];
//                 i++;
//                 cnt++;
//             }
//             else
//             {
//                 if(cnt == ind1) ind1el = n2[j];
//                 if(cnt == ind2) ind2el = n2[j];
//                 j++;
//                 cnt++;
//             }
//         }

//         while(i<n1l)
//         {
//             if(cnt == ind1) ind1el = n1[i];
//             if(cnt == ind2) ind2el = n1[i];
//             i++;
//             cnt++;
//         }
//         while(j<n2l)
//         {
//             if(cnt == ind1) ind1el = n2[j];
//             if(cnt == ind2) ind2el = n2[j];
//             j++;
//             cnt++;
//         }

//         if((n1l+n2l)%2 == 1)
//             return (double)ind2el;
//         else
//             return (ind1el+ind2el)/2.0;
//     }
// }


// BRUTE
// class Solution {
//     public double findMedianSortedArrays(int[] n1, int[] n2) {
//         int i=0 , j=0 , z=0 , n3[] = new int[n1.length + n2.length];
//         while(i<n1.length && j<n2.length)
//         {
//             if(n1[i] < n2[j])
//             {
//                 n3[z] = n1[i];
//                 i++;
//                 z++;
//             }
//             else
//             {
//                 n3[z] = n2[j];
//                 j++;
//                 z++;
//             }
//         }
        
//         while(i<n1.length)
//         {
//             n3[z] = n1[i];
//             i++;
//             z++;
//         }

//         while(j<n2.length)
//         {
//             n3[z] = n2[j];
//             j++;
//             z++;
//         }

//         double ans;

//         if(n3.length % 2  != 0)
//             ans = n3[n3.length/2];
//         else
//             ans = (n3[n3.length/2] + n3[(n3.length/2)-1])/ 2.0;

//         return ans;
//     }
// }