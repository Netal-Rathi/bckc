class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1.0;
        }

        if( n < 0 ){
       //     return 1 / myPow(x , -n);
             return 1.0 / myPow(x, -n);
        }

       double half=myPow(x,n/2);
       if(n%2==0){
        return half*half;
       }else{
        return x*half*half;
       }
        
    }
}
// Title: Pow(x, n)
