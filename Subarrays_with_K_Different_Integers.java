import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    private int atMostK(int[] nums, int k) {
        if (k < 0) return 0;
        
        int start = 0, result = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int end = 0; end < nums.length; end++) {
            int num = nums[end];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            while (countMap.size() > k) {
                int startNum = nums[start];
                countMap.put(startNum, countMap.get(startNum) - 1);
                if (countMap.get(startNum) == 0) {
                    countMap.remove(startNum);
                }
                start++;
            }
            
            result += end - start + 1;
        }
        
        return result;
    }
}
// Title: Subarrays with K Different Integers
