/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return check(root,p,q);
        
    }

    public TreeNode check(TreeNode root,TreeNode p,TreeNode q){
            if(root==null || root==p || root==q){
                return root;
            
            }
            


        TreeNode left=check(root.left,p,q);
        TreeNode right=check(root.right,p,q);
        // if((p<root && q< root ) && (root==p || root==q)){
        //         return root;
        //     }
        //      if((p>root && q>root )&& (root==p || root==q)){
        //         return root;
        //     }
        if(left!=null && right!=null){
            return root;
        }

        return left!=null ?left : right;

    }
}