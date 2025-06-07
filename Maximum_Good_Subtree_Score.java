class Solution {
    public int goodSubtreeSum(int[] vals, int[] par) {
        int maxsum = Integer.MIN_VALUE;

        List<List<Integer>> list = new ArrayList<>();
        int n = par.length;

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

       
        for (int i = 0; i < n; i++) {
            if (par[i] != -1) {
                list.get(par[i]).add(i);
            }
        }

        // For each node, calculate sum of subtree rooted at that node
        for (int i = 0; i < n; i++) {
            int sum = subtreeSum(i, list, vals);
            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }

    private int subtreeSum(int node, List<List<Integer>> list, int[] vals) {
        int sum = vals[node];
        for (int child : list.get(node)) {
            sum += subtreeSum(child, list, vals);
        }
        return sum;
    }
}
