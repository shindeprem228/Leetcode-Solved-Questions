class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo = firstOcc(nums, target);

        if(fo == -1)    return new int[]{-1,-1};

        int lo = lastOcc(nums, target);

        return new int[]{fo,lo};
    }

    public static int firstOcc(int nums[], int target)
    {
        int high = nums.length-1 , low = 0, mid , first=-1;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return first;
    }

    public static int lastOcc(int nums[], int target)
    {
        int high = nums.length-1 , low = 0, mid , last=-1;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return last;
    }

    
}