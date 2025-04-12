import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        calculate(ans, nums, 0, 0, 0);
        return ans.size();
    }
    
    public void calculate(Set<Integer> ans, int[] nums, int i, int j, int k) {
      
        if (i >= nums.length || j >= nums.length || k >= nums.length) {
            return;
        }
        
        
        ans.add(nums[i] ^ nums[j] ^ nums[k]);
        
      
        if (k < nums.length - 1) {
           
            calculate(ans, nums, i, j, k + 1);
        } else if (j < nums.length - 1) {
           
            calculate(ans, nums, i, j + 1, j + 1); 
        } else {
            
            calculate(ans, nums, i + 1, i + 1, i + 1); 
        }
    }
}
// Title: Number of Unique XOR Triplets I
