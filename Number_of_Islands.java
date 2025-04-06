class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    bfs(grid, r, c);
                }
            }
        }
        return numIslands;
    }
    
    private void bfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = '0'; // Mark as visited
        
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            for (int[] dir : directions) {
                int r = current[0] + dir[0];
                int c = current[1] + dir[1];
                
                if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == '1') {
                    queue.add(new int[]{r, c});
                    grid[r][c] = '0'; // Mark as visited
                }
            }
        }
    }
}
// Title: Number of Islands
