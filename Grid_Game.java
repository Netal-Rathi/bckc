class Solution {
    public int[][] prefix_sum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] prefix = new int[rows][cols];
        
        // Compute prefix sum for the first row
        prefix[0][0] = grid[0][0];
        for (int i = 1; i < cols; i++) {
            prefix[0][i] = prefix[0][i - 1] + grid[0][i];
        }
        
        // Compute prefix sum for the second row
        prefix[1][0] = grid[1][0];
        for (int i = 1; i < cols; i++) {
            prefix[1][i] = prefix[1][i - 1] + grid[1][i];
        }
        
        return prefix;
    }

    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        // Compute prefix sums
        int[][] prefix = prefix_sum(grid);

        // Initialize variables
        long sum = Long.MAX_VALUE;

        // Simulate the two-player game
        for (int i = 0; i < n; i++) {
            // Robot 1 chooses column `i`, leaving two paths:
            // 1. Sum of the top row from column `i+1` to the end.
            long topRow = i + 1 < n ? prefix[0][n - 1] - prefix[0][i] : 0;

            // 2. Sum of the bottom row from column `0` to `i-1`.
            long bottomRow = i > 0 ? prefix[1][i - 1] : 0;

            // Robot 2 will minimize Robot 1's maximum possible sum.
            long maxSum = Math.max(topRow, bottomRow);
            sum = Math.min(sum, maxSum);
        }

        return sum;
    }
}

// Title: Grid Game
