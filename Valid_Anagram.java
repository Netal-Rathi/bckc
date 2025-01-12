class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        HashMap <Character,Integer> map1=new HashMap();
     //   HashMap <Character,Integer> map2=new HashMap();
        for(int i=0;i<s.length();i++){
            
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
                
        }
         for(int i=0;i<s.length();i++){
           
                map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
         }
            


        

           for(Character c : map1.keySet()){
            if(map1.get(c)!=0){
                return false;
            }

           }
        return true;
    }
}