class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0, oddCount = 0, result = 0;
        int prefixSubarrays = 0; 
        
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {
                oddCount++;
                prefixSubarrays = 0; 
            }
            
            while (oddCount == k) {
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                prefixSubarrays++; 
                start++;
            }
            
            result += prefixSubarrays;
        }
        
        return result;
    }
}
// Title: Count Number of Nice Subarrays
