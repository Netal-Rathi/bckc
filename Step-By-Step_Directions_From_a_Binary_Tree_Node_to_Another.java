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
    public String getDirections(TreeNode root, int startValue, int destValue) {
       

       List<Character> startpath=new ArrayList<>();
       List<Character> destpath=new ArrayList<>();
       pathfinding(root,startValue,startpath);
       pathfinding(root,destValue,destpath);

       int i=0;
       while(i<startpath.size() && i<destpath.size() && startpath.get(i)== destpath.get(i)){
        i++;
       }
        StringBuilder result=new StringBuilder();
       for(int  j=i;j<startpath.size();j++){
        result.append('U');
       }

       for(int j=i;j<destpath.size();j++){
        result.append(destpath.get(j));
       }
       return result.toString();
       
    }

     public boolean pathfinding(TreeNode root,int value,List<Character> path){

            if(root==null){
                return false;
            }
            if(root.val==value){
                return true;
            }

            path.add('L');
            if(pathfinding(root.left,value,path)){
                return true;
            }
            path.remove(path.size()-1);

            path.add('R');
            if(pathfinding(root.right,value,path)){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
}
// Title: Step-By-Step Directions From a Binary Tree Node to Another
