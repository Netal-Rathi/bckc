class Solution {
    public int countGoodNumbers(long n) {
        if(n==0){
            return 1;
        }
        long mod=1000000007;
        
    if(n%2==0){
        // 5 to the power n% 2 calculates  && 4 to the power
       return (int) ( ( (helper(5,n/2) % mod) * (helper(4,n/2) % mod)) % mod  );
       
    }else{
        //4
      return (int) ((( helper(5,n/2 +1) % mod)* (helper(4,n/2)% mod)) % mod) ;
     
    }
        
    }

    public long helper(long n1,long m){
                long mod=1000000007;
        if(m==0){
            return 1;
        }
        
        if(m %2==0){
            return (helper(n1*n1,m/2) % mod);
        }else{
            return  ((n1* helper(n1*n1,m/2)) % mod );
        }
      

    }
}
// Title: Count Good Numbers
