class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set=new HashSet<>();
        int max_cnt=Integer.MIN_VALUE;
        int start=0;
        for(int i=0;i<s.length();i++){
              while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
                

              } 
             set.add(s.charAt(i));
              max_cnt=Math.max(max_cnt,i-start+1);
                   
        }
        return max_cnt;
        
    }
}
// Title: Longest Substring Without Repeating Characters
