class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n < 2 || k == 0) return 0;

      
        int[][] dp = new int[k + 1][n];

        for (int t = 1; t <= k; t++) {
        
            int normalBuy = -prices[0];     
            int shortSell = prices[0];     

            for (int d = 1; d < n; d++) {
              
                                    Math.max(prices[d] + normalBuy,   
                                             shortSell - prices[d])); 

               
                normalBuy = Math.max(normalBuy, dp[t - 1][d] - prices[d]);
                shortSell = Math.max(shortSell, dp[t - 1][d] + prices[d]);
            }
        }

        return dp[k][n - 1];
    }
}
