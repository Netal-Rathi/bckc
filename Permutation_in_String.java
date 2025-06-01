class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return isvalid(s1,"",s2);
        
    }

    public boolean isvalid(String s,String permutation,String check){
        
            if(s.length()==0  ){
                return check.contains(permutation);

            }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           
          String sub=s.substring(0,i)+s.substring(i+1);
          if(  isvalid(sub,permutation+c,check)){
            return true ;
          }

        }
        return false;
    }
}