import java.util.*;

class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> q = new LinkedList<>();

 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && board[i][j] == 'O') {
                    board[i][j] = 'E'; 
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

                if (i >= 0 && i < m && j >= 0 && j < n && board[i][j] == 'O') {
                    board[i][j] = 'E';       
                   // q.offer(new int[]{i, j}); 
                }
            }
        }

   
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; 
                } else if (board[i][j] == 'E') {
                    board[i][j] = 'O'; 
                }
            }
        }
    }
}

// Title: Surrounded Regions
