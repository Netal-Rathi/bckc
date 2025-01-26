class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";

        for(int i=0;i<strs[0].length();i++){
            char current=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
            if(i >= strs[j].length() || current!=strs[j].charAt(i)){
                return ans;
            }
        }
        ans=ans+current;
        
    }
    return ans;
}
}