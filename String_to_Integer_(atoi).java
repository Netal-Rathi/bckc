class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        return helper(s,0,0,1);
    }

    public int helper(String s,int i,long ans,int sign){
        
        if(i==s.length()){
            return  (int)ans*sign;
        }

        if(i==0 && (s.charAt(i)=='-' || s.charAt(i)=='+')){
           sign=s.charAt(i)=='-'? -1:1;
            return helper(s,i+1,ans,sign);
        }else if(Character.isDigit(s.charAt(i))){
             ans=(ans* 10) + (s.charAt(i)-'0');
            if(ans>Integer.MAX_VALUE){
               return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
          return helper(s,i+1,ans,sign);
        }else{
             return (int) ans * sign;
         
        }
    }
}
// Title: String to Integer (atoi)
