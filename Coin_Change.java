class Solution {
    private int count;
    private int minCount = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
       
        count = 0;

     
        coinChangeHelper(coins, amount);

  
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    private void coinChangeHelper(int[] coins, int amount) {
        if (amount == 0) {
           
            if (count < minCount) {
                minCount = count;
            }
            return;
        }

        if (amount < 0) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            count++;
            coinChangeHelper(coins, amount - coins[i]);
            count--;
        }
    }
}
// Title: Coin Change
