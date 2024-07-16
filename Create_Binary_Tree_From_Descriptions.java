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
        // Find paths from root to startValue and destValue
        List<Character> startPath = new ArrayList<>();
        List<Character> destPath = new ArrayList<>();
        
        findPath(root, startValue, startPath);
        findPath(root, destValue, destPath);
        
        // Find the common prefix length
        int i = 0;
        while (i < startPath.size() && i < destPath.size() && startPath.get(i) == destPath.get(i)) {
            i++;
        }
        
        // Move up to the common ancestor
        StringBuilder result = new StringBuilder();
        for (int j = i; j < startPath.size(); j++) {
            result.append('U');
        }
        
        // Move down to the destination
        for (int j = i; j < destPath.size(); j++) {
            result.append(destPath.get(j));
        }
        
        return result.toString();
    }
    
    private boolean findPath(TreeNode root, int value, List<Character> path) {
        if (root == null) {
            return false;
        }
        if (root.val == value) {
            return true;
        }
        
        path.add('L');
        if (findPath(root.left, value, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        
        path.add('R');
        if (findPath(root.right, value, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        
        return false;
    }
}
