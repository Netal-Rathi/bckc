import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Use sets to store the rows and columns that need to be zeroed
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

        // First pass: Identify all rows and columns to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Second pass: Set rows to zero
        for (int row : zeroRows) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }

        // Third pass: Set columns to zero
        for (int col : zeroCols) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}

// Title: Set Matrix Zeroes
