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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<level;i++){
            if(q.peek().left!=null){
            q.offer(q.peek().left);
            }
            if(q.peek().right!=null){
            q.offer(q.peek().right);
            }
            
            sublist.add(q.remove().val);
            }
            ans.add(sublist);
           // q.push(root.right);
           

        
        }
        return ans;
        
    }
}
// Title: Binary Tree Level Order Traversal
