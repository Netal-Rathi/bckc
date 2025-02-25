// alphabate 1) lower direct 2) uppar modify karke 
// numbers direct
//else skip 

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder ();
        for(int i=0;i<s.length();i++){
            if(97<=s.charAt(i) && s.charAt(i)<=122){
                ans.append(s.charAt(i));
            }else if(65<=s.charAt(i) && s.charAt(i)<=90){
                ans.append(Character.toLowerCase(s.charAt(i)));
            }else if(Character.isDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            }else{
                continue;
            }
        }
        return helper(ans.toString());
        
    }

    public Boolean helper(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}