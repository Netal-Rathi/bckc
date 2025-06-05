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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();

        preorder(root,ans);
        return ans;
        //root left right 
        
    }

    public void preorder(TreeNode root , List<Integer> list){

            if(root==null){
                return;
            }
          //  TreeNode node=new TreeNode(root.val);
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);

    }
}