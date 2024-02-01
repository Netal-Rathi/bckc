import java.util.*;
class Solution {
    public int reverse(int x) {
       
        int sum=0;
        if(Integer.MIN_VALUE=<X && x<=Integer.MAX_VALUE){
           while(x!=0){
              int temp=x%10;
               sum=sum*10+ temp;
               x=x/10;
           }
           return sum;

        }else{
            return 0;
        }
        
    }
}
// Title: Reverse Integer
