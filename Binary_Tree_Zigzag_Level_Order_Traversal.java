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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> ans=new ArrayList();
        if(root==null){
            return ans;
        }
         Queue <TreeNode>q=new LinkedList<>();
       // int counter=0;
       Boolean ltr=true;

        q.add(root);

    while(!q.isEmpty()){
        int level=q.size();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<level;i++){
          TreeNode node=  q.poll();
                if(ltr){
          list.add(node.val);
                }else{
                        list.add(0,node.val);
                }
            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
            
            
      
        }
        ans.add(list);
        ltr=!ltr;
        
       
    }
    return ans;
        
    }
}
// Title: Binary Tree Zigzag Level Order Traversal
