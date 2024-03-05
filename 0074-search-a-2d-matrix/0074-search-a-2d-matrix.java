// Striver
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length , m=matrix[0].length;
        int low=0 , high=n*m-1 , mid;

        while(low<=high)
        {
            mid = (low+high) /2;
            int row=mid/m , col=mid%m;

            if(matrix[row][col] == target)  return true;
            else if(matrix[row][col] > target)  high=mid-1;
            else    low=mid+1;
        }
        return false;
    }
}
// ***+++My Solutions+++*** =>
//Optimal O(log2n) * O(log2m) => O(logn) * O(logm) => O(log (m * n))
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         int n=matrix.length , m=matrix[0].length, low1=0 , high1=n-1 , mid1;

//         while(low1<=high1)
//         {
//             mid1=(low1+high1)/2;

//             int low2=0 , high2=m-1 , mid2;

//             while(low2<=high2)
//             {
//                 mid2=(low2+high2)/2;

//                 if(matrix[mid1][mid2] == target)    return true;
//                 else if(matrix[mid1][mid2] > target)    high2=mid2-1;
//                 else    low2=mid2+1;
//             }
//             if(target < matrix[mid1][0])    high1=mid1-1;
//             else if(target > matrix[mid1][m-1]) low1=mid1+1;
//             else return false;
//         }
//         return false;
//     }
// }

// Better O(n)*O(log2m)
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n=matrix.length , m=matrix[0].length;

//         for(int i=0 ; i<n ; i++)
//         {
//             int low=0 , high=m-1 , mid;
//             while(low<=high)
//             {
//                 mid = (low+high)/2;
//                 if(matrix[i][mid] == target)    return true;
//                 else if(matrix[i][mid] > target)    high = mid-1;
//                 else    low = mid+1;
//             }
//         }
//         return false;
//     }
// }

//Brute O(n*n)
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n=matrix.length, m=matrix[0].length;
//         for(int i=0 ; i<n ; i++)
//         {
//             for(int j=0 ; j<m ; j++)
//             {
//                 if(matrix[i][j] == target)
//                     return true;
//             }
//         }
//         return false;
//     }
// }