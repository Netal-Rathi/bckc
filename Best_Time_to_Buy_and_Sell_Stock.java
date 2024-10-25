class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int temp=0;
        for(int i=0;i<prices.length;i++){
            
            for(int j=i;j<prices.length;j++){

                if(prices[i]<prices[j]){
                 profit=prices[j]-prices[i];
                 if(profit>temp){
                temp=profit;
            }
            profit=0;
                }

            }
            
        }
        return temp;
    }
}
// Title: Best Time to Buy and Sell Stock
