class Solution {
    public int numMagicSquaresInside(int[][] grid) {
    
        if (grid.length < 3 || grid[0].length < 3) {
            return 0;
        }

        int ans = 0;  // This will store the number of magic squares found

        // Loop through the grid starting from every possible 3x3 sub-grid
        for (int row = 0; row <= grid.length - 3; row++) {
            for (int col = 0; col <= grid[0].length - 3; col++) {
                // Check if the 3x3 sub-grid is a magic square
                if (isMagic(grid, row, col)) {
                    ans++;
                }
            }
        }

        return ans;  // Return the count of magic squares
    }

    // Helper function to check if the 3x3 grid is a magic square
    private boolean isMagic(int[][] grid, int row, int col) {
        // Check if the grid contains distinct numbers from 1 to 9
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[row + i][col + j];
                if (val < 1 || val > 9 || seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
        }

        // Check if all rows, columns, and diagonals sum to 15
        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        return (grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] == sum &&
                grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] == sum &&
                grid[row][col] + grid[row + 1][col] + grid[row + 2][col] == sum &&
                grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] == sum &&
                grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] == sum &&
                grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == sum &&
                grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] == sum);
    }
}

// Title: Magic Squares In Grid
