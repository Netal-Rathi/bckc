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
    int post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post=postorder.length-1;
        return traverse(inorder,postorder,0,post);
        
    }

    public TreeNode traverse (int[] inorder, int[] postorder,int start,int end ){

        if(start>end){
            return null;
        }
        if(start<0 || end<0){
            return null;
        }

        int i=postorder[post--];
        TreeNode root=new TreeNode(i);

        int in=find_inorder(inorder, start, end, i);
        root.right=traverse(inorder,postorder,in+1,end);
        root.left=traverse(inorder,postorder,start,in-1);
        return root;



    }

        public int find_inorder(int[] inorder,int start,int end,int value){

        for(int i=start;i<=end;i++){
            if(inorder[i]==value){
                return i;
            }

        }
        return -1;


        }
}
// Title: Construct Binary Tree from Inorder and Postorder Traversal
