import java.util.*;
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
       

for(int i=0;i<words.length;i++){
   if(isprefix(words[i],pref)){
    count++;
   }
}
System.out.println(count);
return count;

    }
    public boolean isprefix(String s1,String s2){
        if(s1.length()<s2.length()){
            return false;

        }
            for(int i=0;i<s2.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        
    }
   
}