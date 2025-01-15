class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }
    
   
     int start=0, end=0;

     for(int i=0;i<s.length();i++){
     int odd=indexes(s,i,i);
     int even=indexes(s,i,i+1);
     int max_len = Math.max(odd,even);
        if(max_len > end - start ){
               start = i - (max_len - 1) / 2;
                end = i + max_len / 2;
        }

     }
  
     return s.substring(start, end + 1);
   
    }

    public int indexes(String s,int l,int r){
          while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;

        }
      return r - l - 1;
    }


}

// Title: Longest Palindromic Substring
