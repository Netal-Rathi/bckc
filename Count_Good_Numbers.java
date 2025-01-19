class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
         long ans=1;
        if (n % 2 == 0) {
            // 5 to the power n% 2 calculates && 4 to the power
return (int)( (helper(5,n/2)  * helper(4,n/2)) % mod);

        } else {
            // 4
            return (int) ((helper(5, n / 2 + 1)  * helper(4, n / 2) ) % mod);

        }

    }

    public long helper(long n1, long m) {
        long ans=1;
        n1 %=  mod;
      
        while(m>0){
      if(m%2==0){
        n1=(n1*n1)% mod;
        m=m/2;

      }else{
        ans=(ans*n1) % mod;
        m-=1;
      }
        }
        return ans ;

    }
}