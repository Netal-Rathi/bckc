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
    int maxsum = Integer.MIN_VALUE;

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
        int sum=Math.max(Math.max(Math.max(left+right+root.val,left+root.val),right+root.val),root.val);
        maxsum = Math.max(maxsum, sum);
        return sum;

    }
}
// Title: Binary Tree Maximum Path Sum
