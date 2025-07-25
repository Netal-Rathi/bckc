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
    public List<Integer> rightSideView(TreeNode root) {
        Queue <TreeNode> q=new LinkedList<>();


        q.add(root);
        List<Integer> ans=new ArrayList<>();
         if (root == null) return ans;

        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }

                 if(node.right!=null){
                    q.add(node.right);
                }
                if(i==level-1){
                    ans.add(node.val);
                }
            }
        }
        return ans;
    }

}
// Title: Binary Tree Right Side View
