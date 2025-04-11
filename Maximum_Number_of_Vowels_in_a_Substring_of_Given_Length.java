class Solution {
    public int maxVowels(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        String vowel="aeiouAEIOU";
        int start=0,max_len=0;
        for(int i=0;i<k;i++){
            if(vowel.contains(String.valueOf(s.charAt(i)))){
                    max_len++;
            }
        }
        int count=max_len;

        for(int i=k-1;i<s.length();i++){
            char c=s.charAt(i);
            
            if(i!=k-1 && vowel.contains(String.valueOf(c))){
                count++;
            }
                while(i-start+1>k){
                   if(vowel.contains(String.valueOf(s.charAt(start)))){
                    count--;
                   }
                   start++;
                        
                }
                    max_len=Math.max(max_len,count);
        }
        return max_len;
        
    }
}
// Title: Maximum Number of Vowels in a Substring of Given Length
