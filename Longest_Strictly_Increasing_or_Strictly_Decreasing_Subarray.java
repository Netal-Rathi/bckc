class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        return helper(nums, 0, 1, 1, 1);
    }

    public int helper(int[] nums, int i, int n, int count, int ans) {
        if (n == nums.length) {
            return Math.max(ans, count);
        }

        if (nums[n] > nums[n - 1] || nums[n] < nums[n - 1]) {
            return helper(nums, i, n + 1, count + 1, Math.max(ans, count + 1));
        } else {
            return helper(nums, n, n + 1, 1, Math.max(ans, count));
        }
    }
}
