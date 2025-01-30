import java.util.*;

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        // Graph representation
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // Build adjacency list
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        
        // Memoization map to avoid repeated DFS calls
        Boolean[][] memo = new Boolean[numCourses][numCourses];
        List<Boolean> ans = new ArrayList<>();

        // Process each query
        for (int[] query : queries) {
            ans.add(dfs(graph, memo, query[0], query[1]));
        }
        return ans;
    }

    private boolean dfs(Map<Integer, List<Integer>> graph, Boolean[][] memo, int src, int target) {
        // If already computed, return memoized value
        if (memo[src][target] != null) {
            return memo[src][target];
        }
        
        // If direct edge exists
        if (graph.get(src).contains(target)) {
            return memo[src][target] = true;
        }

        // DFS traversal
        for (int neighbor : graph.get(src)) {
            if (dfs(graph, memo, neighbor, target)) {
                return memo[src][target] = true;
            }
        }
        
        return memo[src][target] = false;
    }
}

// Title: Course Schedule IV
