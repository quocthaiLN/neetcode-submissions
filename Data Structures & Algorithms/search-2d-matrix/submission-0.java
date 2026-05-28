class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bot = m - 1;
        while (top <= bot) {
            int mid_row = top + (bot - top) / 2;
            if (matrix[mid_row][0] > target) {
                bot = mid_row - 1;
            } else if (matrix[mid_row][n - 1] < target) {
                top = mid_row + 1;
            } else {
                int left = 0, right = n - 1;
                while (left <= right) {
                    int mid_col = left + (right - left) / 2;
                    if (matrix[mid_row][mid_col] > target) {
                        right = mid_col - 1;
                    } else if (matrix[mid_row][mid_col] < target) {
                        left = mid_col + 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
