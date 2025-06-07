class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        long[][] dp = new long[n + 1][2 * k + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int t = 0; t < 2 * k; t++) {
                if (t % 2 == 0) {
            
                    long buy = -prices[i] + dp[i + 1][t + 1];
                    long shortSell = prices[i] + dp[i + 1][t + 1];
                    long skip = dp[i + 1][t];
                    dp[i][t] = Math.max(skip, Math.max(buy, shortSell));
                } else {
                    
                    long sell = prices[i] + dp[i + 1][t + 1];
                    long buyBack = -prices[i] + dp[i + 1][t + 1];
                    long skip = dp[i + 1][t];
                    dp[i][t] = Math.max(skip, Math.max(sell, buyBack));
                }
            }
        }

        return dp[0][0];
    }
}

// Title: Best Time to Buy and Sell Stock V
