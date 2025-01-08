import java.util.*;
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int n=pref.length();
        for(int i=0;i<words.length;i++){

if(words[i].startsWith(pref) ){
                count++;
            }

        }
      //  return count;

// for(int i=0;i<words.length;i++){
//     for(int j=0;j<n;j++){
//         if(words[i].length()<pref.length()){
//             break;
//         }else if(words[i].charAt(j)==pref.charAt(j)){
//             continue;
//         }else{
//             break;
//         }
       
//     }
//      count++;
// }
System.out.println(count);
return count;

    }

   
}
// Title: Counting Words With a Given Prefix
