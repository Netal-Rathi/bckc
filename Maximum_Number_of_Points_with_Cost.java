class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] dp = new long[n];

        // Initialize dp with the values from the first row
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }

        // Process each row starting from the second row
        for (int i = 1; i < m; i++) {
            long[] left = new long[n];
            long[] right = new long[n];

            // Calculate max scores moving left to right
            left[0] = dp[0];
            for (int j = 1; j < n; j++) {
                left[j] = Math.max(left[j - 1] - 1, dp[j]);
            }

            // Calculate max scores moving right to left
            right[n - 1] = dp[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1] - 1, dp[j]);
            }

            // Update dp array for the current row
            for (int j = 0; j < n; j++) {
                dp[j] = points[i][j] + Math.max(left[j], right[j]);
            }
        }

        // The maximum value in the dp array is the result
        long ans = 0;
        for (int j = 0; j < n; j++) {
            ans = Math.max(ans, dp[j]);
        }

        return ans;
    }
}

// Title: Maximum Number of Points with Cost
