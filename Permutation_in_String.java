class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }


     s1=   sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(s1.equals(sort(s2.substring(i,i+s1.length())))){
                return true;
            }
        }
        return false;
    }
    public String sort(String s){
            char[] arr=s.toCharArray();
           // arr.sort();
           Arrays.sort(arr);
        return new String(arr);
    }

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

// Title: Permutation in String
