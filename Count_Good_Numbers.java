class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
         long ans=1;
        if (n % 2 == 0) {
            // 5 to the power n% 2 calculates && 4 to the power
return (int)( (helper(5,n/2 , ans)  * helper(4,n/2 , ans)) % mod);

        } else {
            // 4
            return (int) ((helper(5, n / 2 + 1 , ans)  * helper(4, n / 2 , ans) ) % mod);

        }

    }

    public long helper(long n1, long m, long ans) {
       
       // n1 %=  mod;
      if(m==0){
        return ans;
      }
        
      if(m%2==0){
       return  helper(n1*n1 % mod ,m/2 ,ans);
      }else{
       return  helper(n1, m-1 , ans*n1 % mod);
       
      }
        

    }
}