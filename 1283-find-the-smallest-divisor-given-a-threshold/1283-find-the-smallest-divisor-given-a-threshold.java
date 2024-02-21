class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]>max) max = nums[i];
        }

        int low=1 , high=max , mid , ans=999;

        while(low<=high)
        {
            mid = (low+high)/2;
            int sum=0;

            for(int i=0 ; i<nums.length ; i++)
            {
                sum += (int) Math.ceil((double)nums[i]/(double)mid);
            }
            if(sum<=threshold)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
}