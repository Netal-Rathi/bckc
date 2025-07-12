class Solution {
    public char processStr(String s, long k) {
        int len=0;
        for (char ch:s.toCharArray()){
            if(Character.isLowerCase(ch) ){
                len++;
            }else if(ch=='*'){
                len--;
            }else if(ch=='#'){
                len+=len;
            }
        }

        if(k>=len){
            return '.';
        }

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);

            if(ch=='#'){
                len=len/2;
                if(k>=len){
                    k-=len;
                }
            }else if(ch=='%'){
                k=len-1-k;
            }else if(ch=='*'){
                len++;
            }else {
                len--;
                if(k==len){
                    return ch;
                }
            }
        }
        return '.';
    }
}
// Title: Process String with Special Operations II
