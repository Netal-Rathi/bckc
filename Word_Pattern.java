class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length){
              System.out.println(" 1st false");
            return false;

        }
        
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i)) && !(map.get(pattern.charAt(i)).equals(words[i]))){
                System.out.println(" 2nd false");
                return false;
                
            }

            if(!map.containsKey(pattern.charAt(i)) &&  !map.containsValue(words[i])){
                map.put(pattern.charAt(i),words[i]);
            }else{
             if(!map.containsKey(pattern.charAt(i)) &&  map.containsValue(words[i])){
                return false;
            }
            }

        }
        return true;
        
    }
}
// Title: Word Pattern
