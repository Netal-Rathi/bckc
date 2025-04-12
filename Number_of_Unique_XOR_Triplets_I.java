import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        calculate(ans, nums, 0, 0, 0);
        return ans.size();
    }
    
    public void calculate(Set<Integer> ans, int[] nums, int i, int j, int k) {
      
        if (i >= nums.length || j >= nums.length || k >= nums.length ||  i > j || j > k) {
            return;
        }
        
        
        ans.add(nums[i] ^ nums[j] ^ nums[k]);
        
      
 if (k  < nums.length && j <= k + 1) {
          calculate(ans, nums, i, j, k + 1);
        }
        
        if (j < nums.length && i <= j + 1 && j + 1 <= k) {
            
            calculate(ans, nums, i, j + 1, k);
        }
        
        if (i < nums.length && i + 1 <= j && j <= k) {
            
            calculate(ans, nums, i + 1, j, k);
        }
    }
}
// Title: Number of Unique XOR Triplets I
