class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, target, k);
        return ans;
    }

    public int dfs(TreeNode root, TreeNode target, int k) {
        if (root == null) return -1;

        if (root == target) {
            collectDown(root, k);
            return 0;
        }

        int left = dfs(root.left, target, k);
        if (left != -1) {
            if (left + 1 == k) ans.add(root.val);
            else collectDown(root.right, k - left - 2);
            return left + 1;
        }

        int right = dfs(root.right, target, k);
        if (right != -1) {
            if (right + 1 == k) ans.add(root.val);
            else collectDown(root.left, k - right - 2);
            return right + 1;
        }

        return -1;
    }

    public void collectDown(TreeNode node, int k) {
        if (node == null || k < 0) return;
        if (k == 0) {
            ans.add(node.val);
            return;
        }
        collectDown(node.left, k - 1);
        collectDown(node.right, k - 1);
    }
}
