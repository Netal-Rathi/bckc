class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true; // To keep track of direction

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll(); // ✅ Properly remove the node from queue

                // Add the node's value depending on the direction
                if (leftToRight) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val); // \U0001f501 Insert at beginning to reverse
                }

                // Add children to the queue
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            ans.add(level);
            leftToRight = !leftToRight; // Toggle the direction
        }

        return ans;
    }
}
