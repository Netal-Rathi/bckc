class Solution {
    public boolean checkDivisibility(int n) {
            int product=1;
        int sum=0;
        int temp=n;
        while(temp>0){
            int i=temp%10;
            sum+=i;
            product=product*i;
            temp=temp/10;
            
        }
        int check=product+sum;
        
        return n%check==0;
        
    }
}
// Title: Check Divisibility by Digit Sum and Product
