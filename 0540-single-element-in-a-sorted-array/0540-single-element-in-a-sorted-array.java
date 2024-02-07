class Solution {
    public int singleNonDuplicate(int[] a) {
        int low=1 , high = a.length-2 , mid;
        // int low=0 , high = a.length-1 , mid;
       
        
        if(a.length == 1)   return a[0];
        if(a[0] != a[1])    return a[0];
        if(a[a.length-1] != a[a.length-2])  return a[a.length-1];

        while(low<=high)
        {
            mid = (low+high)/2;

                // if(mid == 0)
                // {
                //     if(a[mid] == a[mid+1])
                //         low=mid+1;
                //     else
                //         return a[mid];
                // }
                // else if(mid == a.length-1)
                // {
                //     if(a[mid] == a[mid-1])
                //         high=mid-1;
                //     else
                //         return a[mid];
                // }

                if(mid == 0)
                    low = mid+1;
                else if(mid==a.length-1)
                    high = mid-1;
            
            if(mid%2 == 0)
            {
                if(a[mid] == a[mid+1])
                    low = mid+1;
                else if(a[mid] == a[mid-1])
                    high = mid-1;
                else return a[mid];
            }
            
            else
            {
                if(a[mid] == a[mid-1])
                    low = mid+1;
                else if(a[mid] == a[mid+1])
                    high = mid-1;
                else return a[mid];
            }
        }
        return 0;
    }
}