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
    int pre=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;

       return  traverse(preorder,inorder,0,n-1);
        
    }

    public TreeNode traverse(int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        // if(start<0 || end<0){
        //     return null;
        // }

        

        int i=preorder[pre++];
        TreeNode node=new TreeNode(i);

        int in =find_inorder(inorder,start,end,i);

        node.left=traverse(preorder,inorder,start,in-1);
  node.right=traverse(preorder,inorder,in+1,end);
  return node;


    }

    public int find_inorder(int[] inorder,int start,int end,int preval){
        for(int i=start;i<=end;i++){
            if(inorder[i]==preval){
                return i;
            }

        }
        return -1;

    }
}
// Title: Construct Binary Tree from Preorder and Inorder Traversal
