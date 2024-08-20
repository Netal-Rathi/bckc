public class StoneGameII {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffixSum = new int[n];

        // Suffix sum array to calculate the sum of piles from i to the end
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        // Fill the DP table
        for (int i = n - 1; i >= 0; i--) {
            for (int M = 1; M <= n; M++) {
                // If the player can take all remaining stones
                if (i + 2 * M >= n) {
                    dp[i][M] = suffixSum[i];
                } else {
                    // Try all possible choices from 1 to 2 * M piles
                    for (int X = 1; X <= 2 * M; X++) {
                        dp[i][M] = Math.max(dp[i][M], suffixSum[i] - dp[i + X][Math.max(M, X)]);
                    }
                }
            }
        }

        return dp[0][1];
    }

 
}
