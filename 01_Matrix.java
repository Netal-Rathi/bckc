class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = bfs(mat, m, n, i, j);
                }
            }
        }
        return ans;
    }

    public int bfs(int[][] mat, int m, int n, int p, int qu) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{p, qu});
        boolean[][] visited = new boolean[m][n];
        visited[p][qu] = true;

        int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        int count = 0;

        while (!q.isEmpty()) {
            int level = q.size();
            while (level-- > 0) {
                int[] arr = q.poll();
                int x = arr[0];
                int y = arr[1];

                if (mat[x][y] == 0) {
                    return count;
                }

                for (int[] d : dir) {
                    int i = x + d[0];
                    int j = y + d[1];
                    if (i >= 0 && i < m && j >= 0 && j < n && !visited[i][j]) {
                        visited[i][j] = true;
                        q.add(new int[]{i, j});
                    }
                }
            }
            count++;
        }

        return count;
    }
}

// Title: 01 Matrix
