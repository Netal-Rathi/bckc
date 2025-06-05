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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans=new ArrayList<>();

        inorder(root,ans);
        return ans;
    }
    public void inorder(TreeNode root , List<Integer> list){

            if(root==null){
                return;
            }
          //  TreeNode node=new TreeNode(root.val);
            
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);

    }
}
// Title: Binary Tree Inorder Traversal
