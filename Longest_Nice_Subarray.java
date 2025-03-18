import java.util.*;

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxsum = Integer.MIN_VALUE; 
        int count = 0;
        int checker = 0; 
        
        for (int left = 0, right = 0; right < nums.length; right++) {
            while ((checker & nums[right]) != 0) { 
              
                checker ^= nums[left]; 
                left++;
            }
            
            
            checker |= nums[right];
            count = right - left + 1; 
            maxsum = Math.max(maxsum, count);
        }
        
        return maxsum > 1 ? maxsum : 1;
    }
}

// Title: Longest Nice Subarray
