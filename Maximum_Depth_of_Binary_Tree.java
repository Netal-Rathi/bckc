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
 
    public int maxDepth(TreeNode root) {
        
           Queue<TreeNode> q=new LinkedList<>();
           if(root==null){
            return 0;
           }

           q.add(root);
           int count=0;
           while(!q.isEmpty()){
            int level=q.size();
                for(int i=0;i<level;i++){
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    q.remove();

                }
                count++;

           }
           return count;
    }
}