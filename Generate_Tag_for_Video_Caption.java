class Solution {
    public String generateTag(String caption) {
        String arr[]= caption.split(" ");
        StringBuilder s=new StringBuilder();
        s.append('#');
        for(String word: arr){
           s.append(Character.toUpperCase(word.charAt(0)));
            for(int j=1;j<word.length();j++){
                char a=word.charAt(j);
                if((a>='a' && a<='z' ) ||(a>='A' && a<='Z') ){
                    s.append(a);
                }
                if(s.length()==100){
                    return s.toString();
                }
            }
        }
        return s.toString();
        
    }
    
}