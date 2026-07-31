class Solution {
    private int calculateCell(int i, int j) {
        return (j / 3) + (i / 3) * 3;
    }

    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cells = new HashSet[n];

        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            cells[i] = new HashSet<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char val = board[i][j];
                if(val == '.' ) continue;
                if (rows[i].contains(val) || cols[j].contains(val)
                    || cells[calculateCell(i, j)].contains(val)) {
                    return false;
                }
                rows[i].add(val);
                cols[j].add(val);
                cells[calculateCell(i, j)].add(val);
            }
        }
        return true;
    }
}
