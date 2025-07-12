class Solution {
    public char processStr(String s, long k) {
      StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                sb.append(sb);
                System.out.println(sb);
            }else if(s.charAt(i)=='%'){
              //  StringBuilder sk=new StringBuilder(sb);
               // sb.append(sk.reverse());
                sb.reverse();
            }else if(s.charAt(i)=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(s.charAt(i));
            }
        }    
       if(k>=sb.length()){
           return '.';
       }
        return sb.charAt((int)k);
    }
    public void reversestring(StringBuilder ok){
        int i=0, j=ok.length()-1;
        while(i<=j){
            char temp=ok.charAt(i);
            ok.setCharAt(i,ok.charAt(j));
            ok.setCharAt(j,temp);
            
            // s.charAt(i)=s.charAt(j);
            // s.charAt(j)=temp;
        }  
       //return s;
    }
}