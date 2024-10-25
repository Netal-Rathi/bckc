class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE; 
        
        for (int price : prices) {
          
            if (price < minPrice) {
                minPrice = price;
            }
           
            int profit = price - minPrice;
          
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        return maxProfit; 
    }
}

// Title: Best Time to Buy and Sell Stock
