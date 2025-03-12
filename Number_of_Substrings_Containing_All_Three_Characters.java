class Solution {

    public int numberOfSubstrings(String s) {
        int count=0, start=0;
        HashMap<Character,Integer> map=new HashMap<>();
    

        for(int end=0;end<s.length();end++){
            Character l=s.charAt(end);
            map.put(l,map.getOrDefault(l,0)+1);

            while(map.size()==3){
                count+=s.length()-end;
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
              
                if(map.get(s.charAt(start))==0){
                    map.remove(s.charAt(start));
                }
                start++;
            }
      
        }
        return count;
   
    }
}
// Title: Number of Substrings Containing All Three Characters
