class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        
        Queue<int[]> q=new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && grid[i][j] == 1) {
                    grid[i][j] = -1; 
                    q.offer(new int[]{i, j});
                }
            }
        }

                int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int x = cell[0];
            int y = cell[1];

            for (int[] d : dir) {
                int i = x + d[0];
                int j = y + d[1];

                if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
                    grid[i][j] = -1;       
                    q.offer(new int[]{i, j}); 
                }
            }
        }

            for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              if(grid[i][j]==1){
                count++;
              }
            }
        }
        return count;

    }
}
// Title: Number of Enclaves
