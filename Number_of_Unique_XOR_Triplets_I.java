import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> uniqueXors = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int ijXor = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (j > i) {
                    ijXor ^= nums[j];
                }
                int ijkXor = ijXor;
                for (int k = j; k < nums.length; k++) {
                    if (k > j) {
                        ijkXor ^= nums[k];
                    }
                    uniqueXors.add(ijkXor);
                }
            }
        }
        
        return uniqueXors.size();
    }
}