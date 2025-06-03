class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        // Initialize board with dots
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < n; i++) row.append('.');
        for (int i = 0; i < n; i++) board.add(row.toString());

        place(board, 0, n, ans);
        return ans;
    }

    public void place(List<String> board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            ans.add(new ArrayList<>(board));  // Clone the board
            return;
        }

        for (int j = 0; j < n; j++) {
            if (issafe(board, row, j, n)) {
                // Place queen
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString());

                place(board, row + 1, n, ans);

                // Backtrack
                sb.setCharAt(j, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public boolean issafe(List<String> board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }

        return true;
    }
}

// Title: N-Queens
