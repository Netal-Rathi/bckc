class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        Arrays.fill(colour, -1);

        for (int start = 0; start < n; start++) {
            if (colour[start] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(start);
                colour[start] = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (int neighbor : graph[node]) {
                        if (colour[neighbor] == -1) {
                            colour[neighbor] = 1 - colour[node];
                            q.offer(neighbor);
                        } else if (colour[neighbor] == colour[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
