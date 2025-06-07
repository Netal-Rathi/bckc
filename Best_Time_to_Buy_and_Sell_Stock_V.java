class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n < 2 || k == 0) return 0;

        long[][] dp = new long[k + 1][n];

        for (int t = 1; t <= k; t++) {
            long normalBuy = -prices[0];
            long shortSell = prices[0];

            for (int d = 1; d < n; d++) {
                dp[t][d] = Math.max(dp[t][d - 1],
                              Math.max(prices[d] + normalBuy,
                                       shortSell - prices[d]));

                normalBuy = Math.max(normalBuy, dp[t - 1][d] - prices[d]);
                shortSell = Math.max(shortSell, dp[t - 1][d] + prices[d]);
            }
        }

        return dp[k][n - 1];
    }
}
