class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        return helper(nums, 0, 1, 1, 1, 2); // Start with neutral status
    }

    public int helper(int[] nums, int i, int n, int count, int ans, int status) {
        if (n == nums.length) {
            return Math.max(ans, count);
        }

        if (nums[n - 1] < nums[n] && (status == 1 || status == 2)) {
            if (status == 2) {
                status = 1;
            }
            return helper(nums, i, n + 1, count + 1, Math.max(count + 1, ans), status);

        } else if (nums[n - 1] > nums[n] && (status == 0 || status == 2)) {
            if (status == 2) {
                status = 0;
            }
            return helper(nums, i, n + 1, count + 1, Math.max(count + 1, ans), status);

        } else {
            status = 2; // Reset to neutral
            return helper(nums, n, n + 1, 1, Math.max(count, ans), status);
        }
    }
}

// Title: Longest Strictly Increasing or Strictly Decreasing Subarray
