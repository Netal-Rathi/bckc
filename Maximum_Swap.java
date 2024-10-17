class Solution {
    public int maximumSwap(int num) {
       int T=0;
        StringBuilder s=new StringBuilder(String.valueOf(num));
       //String s=String.valueOf(num);
       while(T!=s.length()){
       char large=s.charAt(T);
       int no=T;
       for(int i=T;i<s.length();i++){
        if(large<=s.charAt(i)){
            large=s.charAt(i);
            no=i;
        }

       }
       if(s.charAt(T)==large){
        T++;
          }else{
            char temp=s.charAt(T);
            s.setCharAt(T,s.charAt(no));
            s.setCharAt(no,temp);
            return Integer.parseInt(s.toString());
          }
       
        

    }
    return num;
}
}
// Title: Maximum Swap
