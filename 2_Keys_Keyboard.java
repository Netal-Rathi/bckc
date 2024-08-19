class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;  // Base case: if n is 1, no operations are needed.

        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = i; // Start with the worst case where you perform i operations (1 copy and i-1 pastes)
            for (int j = i / 2; j > 0; j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + (i / j);
                    break;
                }
            }
        }
        return dp[n];
    }
}
