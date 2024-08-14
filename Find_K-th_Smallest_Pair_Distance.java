import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);  // Sort the array first
        
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];  // Maximum possible distance
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Count pairs with a distance less than or equal to mid
            int count = 0;
            int left = 0;
            
            for (int right = 0; right < nums.length; right++) {
                while (nums[right] - nums[left] > mid) {
                    left++;
                }
                count += right - left;
            }
            
            // Binary search adjustment
            if (count >= k) {
                high = mid;  // Look for smaller distance
            } else {
                low = mid + 1;  // Increase the minimum possible distance
            }
        }
        
        return low;
    }
    
    
}
