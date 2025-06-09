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
      int count=0;
    public int countNodes(TreeNode root) {
      
        check(root);
        return count;

        
        
    }

    public void check(TreeNode root){
        if(root==null){
            return ;
        }
        count++;
        check(root.left);
        check(root.right);


    }
}