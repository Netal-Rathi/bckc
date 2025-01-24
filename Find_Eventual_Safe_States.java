import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        int n = graph.length;
        boolean[] ans = new boolean[n];
        Arrays.fill(ans, true); // Assume all nodes are safe initially

        // Step 1: Mark terminal nodes as safe
        for (int i = 0; i < n; i++) {
            if (graph[i].length == 0) {
                list.add(i); // Add terminal nodes to list
            }
        }

        // Step 2: Check other nodes
        for (int i = 0; i < n; i++) {
            if (!Arrays.stream(graph[i]).allMatch(node -> list.contains(node))) {
                ans[i] = false; // Mark as unsafe if not all neighbors are in `list`
            }
        }

        // Step 3: Add all safe nodes to result list
        for (int i = 0; i < n; i++) {
            if (ans[i]) {
                list.add(i);
            }
        }

        // Step 4: Sort the result
        list.sort(Comparator.naturalOrder());
        return list;
    }
}

// Title: Find Eventual Safe States
