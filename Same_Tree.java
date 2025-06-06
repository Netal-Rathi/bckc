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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
        
    }
    public boolean check(TreeNode one ,TreeNode two){
        if(one==null && two==null){
            return true;
        }

        if(one==null || two==null || one.val!=two.val){
            return false;
        }
        Boolean left=check(one.left,two.left);
        Boolean right=check(one.right,two.right);
       

      //  return check(one.left,two.left) && check(one.right,two.right);
      return left && right;
    }
}
// Title: Same Tree
