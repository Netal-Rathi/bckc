class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        int ans=0;
        while(s.charAt(i)!=' '){
            ans++;
            i--;
        }
        return ans;
        
    }
}
// Title: Length of Last Word
