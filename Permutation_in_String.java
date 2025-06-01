class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

                char[] s1count=new char[26];
                char[] s2count =new char[26];

                for(int i=0;i<s1.length();i++){
                    s1count[s1.charAt(i)-'a']++;
                     s2count[s2.charAt(i)-'a']++;
                }

                // for(int i=0;i<s1.length();i++){
                //     s2count[s2.charAt(i)-'a']++;
                // }
                    
                    int start=0;
                
                for(int i=s1.length();i<s2.length();i++){
                    if(Arrays.equals(s1count ,s2count)){
                    return true ;
                }

                    s2count[s2.charAt(start)-'a']--;
                    start++;
                    s2count[s2.charAt(i)-'a']++;


                } 
        return Arrays.equals(s1count ,s2count);

        // through sorrting 
    //     if(s1.length()>s2.length()){
    //         return false;
    //     }


    //  s1=   sort(s1);
    //     for(int i=0;i<=s2.length()-s1.length();i++){
    //         if(s1.equals(sort(s2.substring(i,i+s1.length())))){
    //             return true;
    //         }
    //     }
    //     return false;
    }
    // answer 2 sorting 
    // public String sort(String s){
    //         char[] arr=s.toCharArray();
    //        // arr.sort();
    //        Arrays.sort(arr);
    //     return new String(arr);
    // }
// answer 1 recurssion 
    // public boolean isValid(String s, String permutation, String check) {
    //     if (s.length() == 0) {
    //         return check.contains(permutation);
    //     }

    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         String sub = s.substring(0, i) + s.substring(i + 1);
    //         if (isValid(sub, permutation + c, check)) {
    //             return true;  // As soon as we find a match, return true
    //         }
    //     }

    //     return false; // If no permutation matches
    // }
}
