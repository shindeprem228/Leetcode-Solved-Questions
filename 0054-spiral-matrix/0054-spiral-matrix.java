class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();

        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {
            // right
            for (int i = left; i <= right; i++)
                al.add(matrix[top][i]);
            top++;

            // bottom
            for (int i = top; i <= bottom; i++)
                al.add(matrix[i][right]);
            right--;

            // left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    al.add(matrix[bottom][i]);
                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    al.add(matrix[i][left]);
                left++;
            }
        }
        return al;
    }
}