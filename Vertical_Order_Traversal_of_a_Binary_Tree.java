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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       TreeMap<Integer,List<Integer>> ans=new TreeMap<>();
       List<List<Integer>> finalans=new ArrayList<>();

       check(ans,root,0);

        // for(Map.Entry<Integer,List<>Integer> entry:ans.entrySet)


       for(List<Integer> list :ans.values() ){
        Collections.sort(list);
        finalans.add(list);
       }


return finalans;
       
        
    }
        public void check(TreeMap<Integer,List<Integer>> ans,TreeNode node,int idx){

                if(node==null){
                    return;
                }
                   //ans.get(idx).add(node.val);
                 //  map.put(node.val,map.getOrDefault(node.val,idx));
                 ans.putIfAbsent(idx,new ArrayList<>());
                 ans.get(idx).add(node.val);
                check(ans,node.left,idx-1);
                check(ans,node.right,idx+1);

                
        }

}