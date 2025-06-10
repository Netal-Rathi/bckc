/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();
        makeparent (map,root,null);
        q.add(target);
        visited.add(target);
        int current=0;

        while(!q.isEmpty()){
           int size=q.size();
            if(current==k){
                        break;
                    }

           for(int i=0;i<size;i++){

                    TreeNode node=q.poll();
                   
                    if(node.left!=null && !visited.contains(node.left)){
                        q.offer(node.left);
                        visited.add(node.left);
                    }

                     if(node.right!=null && !visited.contains(node.right)){
                        q.offer(node.right);
                        visited.add(node.right);
                    }

                    TreeNode n=map.get(node);
                    if(n!=null && !visited.contains(n)){
                         q.offer(n);
                        visited.add(n);


                    }
                      
                    

           }
            current++;  
        }
           
           
        
                
           while(!q.isEmpty()){
            TreeNode check=q.poll();
            ans.add(check.val);

           }
        
           

        

        return ans;
        
    }

    public void makeparent(HashMap<TreeNode,TreeNode> map,TreeNode child,TreeNode parent){
                if(child==null){
                    return ;
                }
        if(parent!=null){
        map.put(child,parent);
        }

        makeparent(map,child.left,child);
        makeparent(map,child.right,child);

    }
}
// Title: All Nodes Distance K in Binary Tree
