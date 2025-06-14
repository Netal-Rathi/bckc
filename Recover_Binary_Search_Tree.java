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

//  // my approch 
// class Solution {
//         TreeNode previous=new TreeNode(Integer.MIN_VALUE);
//         TreeNode lefts=null;
//        TreeNode rights=null;
//         TreeNode middle =null;
//     public void recoverTree(TreeNode root) {
            
//                 inorder(root);
//                  int temp=lefts.val;
//                 if(lefts!=null && rights!=null){
                   
//                     lefts.val=rights.val;
//                     rights.val=temp;
//                 } else{
//                     lefts.val=middle.val;
//                     middle.val=temp;

//                 }

        
//     }

//     public void inorder(TreeNode root){
//         if(root==null){
           
//             return ;
//         }
//      //   ans.add(root.val);
     

//         inorder(root.left);
//                 if(root.val<previous.val){
//                     if(lefts==null){
//                     lefts= previous;
//                     middle=root;
//                     }else{
//                         rights=root;
//                     }
//                 }
//                 previous=root;
//         inorder(root.right);


//     }
// }

// gpt same but good writting 
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
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    TreeNode first=null;
    TreeNode second=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
     int temp=first.val;
        first.val=second.val;
        second.val=temp;

        
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
            inorder(root.left);
        if(first==null &&root.val<prev.val){
            first=prev;
            second=root;
        } 
        if(first!=null && root.val<prev.val){
            second=root;
        }
        prev=root;

        inorder(root.right);




    }
}
// Title: Recover Binary Search Tree
