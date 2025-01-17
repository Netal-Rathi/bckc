class Solution {
    public double myPow(double x, int n) {
        return solve(x,n);
        
    }

       public double solve(double x, int n) {
        
        if(n==0){
            return 1.0;
        }

        if( n < 0 ){
       //     return 1 / myPow(x , -n);
             return solve(1/x, -n);
        }

      if(n%2==0){
        return solve(x*x,n/2);
      }else{
        return x*solve(x*x,n/2);
      }
        
    }
}
// Title: Pow(x, n)
