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
    int base=Integer.MAX_VALUE;
    int minimum=Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return check(root,minimum,base);
        
    }

    public Boolean check(TreeNode counter,int root,int base){
        if(counter==null){
            return true;
        }
                    if(counter.val<=root || counter.val>base ){
                        return false;
                    }
                   
         //   TreeNode node=new TreeNode(counter);
       Boolean  left= check(counter.left,minimum,counter.val);
     
       Boolean right=check(counter.right,counter.val,base);
     

return left && right;
    }
}