class Solution {
    public String generateTag(String caption) {
        String arr[]= caption.split(" ");
        StringBuilder s=new StringBuilder();
        s.append('#');
s.append(Character.toLowerCase(arr[0].charAt(0)));
        if(arr[0].length()>=100){
        s.append(arr[0].substring(1,100));
        }else{
              s.append(arr[0].substring(1));
        }
        for( int i=1;i<arr.length;i++){
            String word=arr[i];
            if(!word.equalsIgnoreCase("leetcode")  ){
           s.append(Character.toUpperCase(word.charAt(0)));
                 if(s.length()==100){
                    return s.toString();
                }
            }else{
               s.append(Character.toLowerCase(word.charAt(0)));
                 if(s.length()==100){
                    return s.toString();
                }
            }
            for(int j=1;j<word.length();j++){
                char ch=Character.toLowerCase(word.charAt(j));
                if((ch>='a' && ch<='z' )  ){
                    s.append(ch);
                }
                if(s.length()==100){
                    return s.toString();
                }
            }
        }
        return s.toString();
        
    }
    
}