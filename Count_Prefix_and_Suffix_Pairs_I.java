class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int k=i+1;k<words.length;k++){
                if(isprefix(words[i],words[k]) && is_suffix(words[i],words[k])){
                    count++;
                }
                
            
            }
        }
         return count;
        
    }

    public boolean isprefix(String s1,String s2){
        if(s1.length()>s2.length()){
            return false;

        }
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        
    }

    public boolean is_suffix(String s1,String s2){
        if(s1.length()>s2.length()){
            return false;

        }       int k=s2.length()-1;
            for(int i=s1.length()-1 ; i>=0;i--){
                if(s1.charAt(i)!=s2.charAt(k)){
                    return false;
                }
                k--;
            }
            return true;
        
    }
   
}
// Title: Count Prefix and Suffix Pairs I
