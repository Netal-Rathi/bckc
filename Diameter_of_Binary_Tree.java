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
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
        
    }

    public int helper(TreeNode root, int maxlen){

        if(root==null){
            return 0;
        }
        int left = helper(root.left,maxlen);

        int right=helper(root.right,maxlen);
        maxlen=Math.max(maxlen, Math.abs(left-right )+1);



    return Math.max(left,right)+1 ;

    }
}