class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map =new HashMap<>();
        StringBuilder ans=new StringBuilder();

        if(s.length()!=t.length()){
            return false;
        }
        if(s==t){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(s.charAt(i))){
                ans.append(map.get(s.charAt(i)));
            //   s.replaceAll(s.charAt(i),map.get(s.charAt(i)));
            //   charAt(i)=map.get(s.charAt(i));
                
            }else{
                map.put(s.charAt(i),t.charAt(i));
             ans.append(map.get(s.charAt(i)));
                
            }
        }
        System.out.println(ans.toString());
        if(ans.toString().equals(t)){
            return true;
        }else{
            return false;
        }

        
    }
}