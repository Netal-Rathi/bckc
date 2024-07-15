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
 import java.util.*;
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> Nodes=new HashMap<>();
       
        Set <Integer> children =new HashSet<>();

        for(int[] i: descriptions){
            int parentval=i[0];
            int childval=i[1];
            boolean isleftchild =i[2]==1;

            TreeNode parent=Nodes.getOrDefault(parentval,new TreeNode(parentval));
            TreeNode child=Nodes.getOrDefault(childval,new TreeNode(childval));

            if(isleftchild){
                parent.left=child;
            }else{
                parent.right=child;
            }

            Nodes.put(parentval,parent);
            Nodes.put(childval,child);
            children.add(childval);

           

        }
         TreeNode root=null;

           for (int key : Nodes.keySet()){
                if(!children.contains(key)){
                    root=Nodes.get(key);
                    break;
                }
            }
        return root;
    
    }
}