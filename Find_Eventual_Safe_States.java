import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        int n = graph.length;
        boolean[] ans = new boolean[n];
        Arrays.fill(ans, true); // Initialize all nodes as safe

        // Identify terminal nodes (no outgoing edges)
        for (int i = 0; i < n; i++) {
            if (graph[i].length == 0) {
                list.add(i); // Add terminal nodes to the list
                ans[i] = true; // Terminal nodes are always safe
            }
        }

        // Check if nodes are safe
        boolean updated = true;
        while (updated) { // Repeat until no further updates are possible
            updated = false;
            for (int i = 0; i < n; i++) {
                if (ans[i] && !(Arrays.stream(graph[i]).allMatch(list::contains))) {
                    ans[i] = false; // Mark node as unsafe
                    updated = true; // Flag that an update occurred
                }
            }
        }

        // Collect safe nodes into the list
        for (int i = 0; i < n; i++) {
            if (ans[i]) {
                list.add(i);
            }
        }

        list.sort(Comparator.naturalOrder()); // Sort the list in ascending order
        return list; // Return the list of safe nodes
    }
}

// Title: Find Eventual Safe States
