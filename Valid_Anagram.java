class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        HashMap <Character,Integer> map1=new HashMap();
        HashMap <Character,Integer> map2=new HashMap();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
                
            }else {
                map1.put(s.charAt(i),1);
            }
              if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
            }else {
                map2.put(t.charAt(i),1);
            }


        }

           for(Character c : map1.keySet()){
            if(!map1.get(c).equals(map2.get(c))){
                return false;
            }

           }
        return true;
    }
}