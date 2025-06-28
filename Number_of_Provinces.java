class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int node, int[][] graph, int[] visited) {
        visited[node] = 1;
        for (int j = 0; j < graph.length; j++) {
            if (graph[node][j] == 1 && visited[j] == 0) {
                dfs(j, graph, visited);
            }
        }
    }
}

// Title: Number of Provinces
