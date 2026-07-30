class NumMatrix {
    private int[] arr;
    private int n, m;

    public NumMatrix(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        arr = new int[m * n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k] = matrix[i][j];
                k++;
            }
        }
    }

    private int getIdx(int row, int col) {
        return n * row + col;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += arr[getIdx(i, j)];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */