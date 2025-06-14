import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int mod = 1_000_000_007;
        long count = 0;

        Map<Integer, Integer> suffix = new HashMap<>();
        Map<Integer, Integer> prefix = new HashMap<>();

       
        for (int num : nums) {
            suffix.put(num, suffix.getOrDefault(num, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            int x = nums[j];
          
            suffix.put(x, suffix.get(x) - 1);

            int left = prefix.getOrDefault(2 * x, 0);   
            int right = suffix.getOrDefault(2 * x, 0);  

            count = (count + (1L * left * right)) % mod;

           
            prefix.put(x, prefix.getOrDefault(x, 0) + 1);
        }

        return (int) count;
    }
}

// Title: Count Special Triplets
