class Solution {
    public String processStr(String s) {

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
        return sb.toString();
    }
}
// Title: Process String with Special Operations I
