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
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return check(preorder,Integer.MAX_VALUE);
        
    }

    public TreeNode check(int[] preorder, int bound){

            if(idx==preorder.length || preorder[idx]>bound){
                return null;
            }

            TreeNode root =new TreeNode(preorder[idx++]);
            root.left=check(preorder,root.val);
            root.right=check(preorder,bound);
            return root;
    }
}