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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        int maxwidth=0;

        q.add(new Pair<>(root,0));
        while(!q.isEmpty()){
            int level=q.size();
            //List<Integer> list=new ArrayList<>();
            // int start=q.front().getValue();
            // int end=q.back.getValue();
            int start=0,last=0;

           
            for(int i=0;i<level;i++){
                Pair<TreeNode,Integer>p=q.poll();
                TreeNode node=p.getKey();
                int v=p.getValue();
                
                if(i==0){
                        start=v;
                }

                if(i==level-1){
                   last=v;

                }
                
                if(node.left!=null){

                        q.add(new Pair<>(node.left,v*2+1));
                }

                if(node.right!=null){
                     q.add(new Pair<>(node.right,v*2+2));

                }
            }
             maxwidth=Math.max(maxwidth,last-start+1);
           

        }
        return maxwidth;
        
    }
    
}