class Solution {
    public boolean search(int[] nums, int target) {
        int high=nums.length-1 , low=0 , mid ;
        
        while(low<=high)
        {
            mid=(low+high)/2;
            
            if(nums[mid] == target) return true;

            else if(nums[mid] == nums[low] && nums[mid] == nums[high])
            {
                low = low+1;
                high=high-1;
            }
            
            else if(nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target <= nums[mid])
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            
            else
            {
                if(nums[mid] <= target && target <= nums[high])
                    low = mid+1;
                else 
                    high = mid-1;
            }
        }
        
        return false;
    }
}