class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1){
            return 1;
        }
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        int ans=0;
        while(  i>=0 && s.charAt(i)!=' ' ){
            ans++;
            i--;
        }
        return ans;
        
    }
}