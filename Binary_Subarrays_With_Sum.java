class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0; // Initialize count of subarrays whose sum equals goal
        int sum = 0; // Initialize sum
        int left = 0; // Left pointer of the sliding window
        
        // Loop through the array
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Add the current element to sum
            
            // Adjust the window's left pointer to maintain the sum
            while (left < right && sum > goal) {
                sum -= nums[left]; // Remove elements from the left side of the window
                left++; // Move the left pointer to the right
            }
            
            // If sum equals goal, increment count
            if (sum == goal) {
                count++;
                
                // Check for additional subarrays with the same sum
                int temp = left;
                while (temp < right && nums[temp] == 0) {
                    count++;
                    temp++;
                }
            }
        }
        
        return count; // Return the count of subarrays
    }
}

// Title: Binary Subarrays With Sum
