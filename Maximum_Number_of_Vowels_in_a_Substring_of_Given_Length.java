class Solution {
    public int maxVowels(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        
        int max_len = 0;
        int count = 0;
        
     
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        max_len = count;
  
        for (int i = k; i < s.length(); i++) {
        
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            
            if (isVowel(s.charAt(i))) {
                count++;
            }
       
            max_len = Math.max(max_len, count);
        }
        
        return max_len;
    }
    
  
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
// Title: Maximum Number of Vowels in a Substring of Given Length
