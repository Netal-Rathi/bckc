import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        Arrays.sort(nums); 
        System.out.println(Arrays.toString(nums)); // Debugging statement

        return helper(nums, 1, 1, 1); // Start from index 1 with count 1
    }

    private int helper(int[] nums, int n, int count, int ans) {
        if (n == nums.length) {
            return Math.max(count, ans);
        }

        if (nums[n] == nums[n - 1]) {  
            // Skip duplicates without affecting count
            return helper(nums, n + 1, count, ans);
        }

        if (nums[n] == nums[n - 1] + 1) {
            // Increase count if consecutive
            return helper(nums, n + 1, count + 1, Math.max(count + 1, ans));
        }

        // Reset count when the sequence breaks
        return helper(nums, n + 1, 1, Math.max(count, ans));
    }
}

// Title: Longest Consecutive Sequence
