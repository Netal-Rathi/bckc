class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLength = 1; // Minimum length is 1 (single element)
        
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, helper(nums, i, i + 1, 1, 1, 2));
        }
        
        return maxLength;
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
            // Start a new sequence from the next index
            return Math.max(ans, count);
        }
    }
}
