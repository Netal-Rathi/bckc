class Solution {
    public int goodSubtreeSum(int[] vals, int[] par) {
        int n = vals.length;
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) tree.add(new ArrayList<>());

        int root = -1;
        for (int i = 0; i < n; i++) {
            if (par[i] == -1) {
                root = i;
            } else {
                tree.get(par[i]).add(i);
            }
        }

        int[] maxSum = new int[1];  
        dfs(root, tree, vals, maxSum);
        return maxSum[0];
    }

    private int dfs(int node, List<List<Integer>> tree, int[] vals, int[] maxSum) {
        int sum = vals[node];
        for (int child : tree.get(node)) {
            sum += dfs(child, tree, vals, maxSum);
        }
        maxSum[0] = Math.max(maxSum[0], sum);
        return sum;
    }
}
