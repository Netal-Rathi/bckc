class Solution {
    public int maxProfit(int[] prices) {
       int maxsell=prices[0], buy= prices[0] , profit=0;
       for(int i=1;i<prices.length;i++){
        if(prices[i]>=maxsell){
            maxsell=prices[i];
        }else{
            profit+= maxsell- buy;
            maxsell=prices[i];
            buy=prices[i];
        }

       }
       profit+= maxsell- buy;
       return profit ;

    }
}
// Title: Best Time to Buy and Sell Stock II
