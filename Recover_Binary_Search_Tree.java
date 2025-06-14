
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