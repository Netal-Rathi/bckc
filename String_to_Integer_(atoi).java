class Solution {
    public int myAtoi(String s) {
         s=s.trim();
         if(s.length()==0){
            return 0;
         }
    long ans=0;
    int i=0;
    int sign=1;
   if(s.charAt(0)=='-' || s.charAt(0)=='+'){
    sign=(s.charAt(0)=='+') ? 1 :-1;
    i++;
   }

   while(i<s.length() && Character.isDigit(s.charAt(i))){
    ans=(ans*10) + (s.charAt(i)-'0');
    //i++;
    if(ans>Integer.MAX_VALUE){
       if(sign==1){
        return Integer.MAX_VALUE;
       }else{
        return Integer.MIN_VALUE;
       }
    }
    i++;
   }
   return (int) (ans*sign);

    }
}
// Title: String to Integer (atoi)
