import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        optimizedCalculate(ans, nums, 0, 0, 0);
        return ans.size();
    }
    
    private void optimizedCalculate(Set<Integer> ans, int[] nums, int i, int j, int k) {

        if (i >= nums.length) {
            return;
        }
        
        
        if (j >= nums.length) {
            optimizedCalculate(ans, nums, i + 1, i + 1, i + 1);
            return;
        }
        
       
        if (k >= nums.length) {
            optimizedCalculate(ans, nums, i, j + 1, j + 1);
            return;
        }
        
   
        if (i <= j && j <= k) {
            ans.add(nums[i] ^ nums[j] ^ nums[k]);
        }
        
     
        optimizedCalculate(ans, nums, i, j, k + 1);
    }
}