class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int i=0 , j=0 , z=0 , n3[] = new int[n1.length + n2.length];
        while(i<n1.length && j<n2.length)
        {
            if(n1[i] < n2[j])
            {
                n3[z] = n1[i];
                i++;
                z++;
            }
            else
            {
                n3[z] = n2[j];
                j++;
                z++;
            }
        }
        
        while(i<n1.length)
        {
            n3[z] = n1[i];
            i++;
            z++;
        }

        while(j<n2.length)
        {
            n3[z] = n2[j];
            j++;
            z++;
        }

        double ans;

        if(n3.length % 2  != 0)
            ans = n3[n3.length/2];
        else
            ans = (n3[n3.length/2] + n3[(n3.length/2)-1])/ 2.0;

        return ans;
    }
}