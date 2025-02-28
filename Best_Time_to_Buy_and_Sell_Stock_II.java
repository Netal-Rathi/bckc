class Solution {
    public int maxProfit(int[] prices) {
        // if(prices==Arrays.sort(prices)){
        //     return 0;
        // }
        int sum=0,buy=0,sell=0;

        for(int i=0;i<prices.length-1;i++){
            while(i<prices.length-1 && prices[i]>prices[i+1] ){
                i++;
            }
            System.out.println("buy : " + i);
            buy=i;
            while(i<prices.length-1  && (prices[i]<prices[i+1]  && prices[buy]<=prices[i+1]) ){
                i++;
            }
            System.out.println("sell : " + i);
            sell=i;
            sum+= prices[sell]-prices[buy];
            System.out.println("total : " + sum);
            System.out.println("i : " + i);

        }

return sum;
        
    }
}
// Title: Best Time to Buy and Sell Stock II
