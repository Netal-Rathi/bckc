/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxsum = 0;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxsum;

    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;

        }

        int left = helper(root.left);
        int right = helper(root.right);
        maxsum = Math.max(maxsum, (left + right + root.val));
        return left + right + root.val;

    }
}
// Title: Binary Tree Maximum Path Sum
