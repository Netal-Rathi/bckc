class Solution {
    public int characterReplacement(String s, int k) {
        int start=0,max_len=0,count=0;
        for(int end=0;end<s.length();end++){
            char sa=s.charAt(start);
            if(s.charAt(end)!=sa){
                count++;
            }
        while(count>k){
                    if(s.charAt(start)!=sa){
                            count--;
                    }
                    start++;

        }


            max_len=Math.max(max_len,end-start+1);
        }
        return max_len;
        
    }
}