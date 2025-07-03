class Solution {
    
    public int fib(int n) {
        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        return check(n, dp);

        
        
    }

    public int check(int n, int [] dp){

        if(dp[n]!=-1){
            return dp[n];
        }else{
           // int res=0;
        if(n==0 || n==1){
            // res=0;
            dp[n]=n;
        }else{
            dp[n]= check(n-1,dp) + check(n-2,dp);
        }
        }
        return dp[n];
    }

    
}