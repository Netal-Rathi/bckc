class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n) {
            return false;
        }

        char[] s1count = new char[26];
        char[] s2count = new char[26];

        for (int i = 0; i < m; i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        int start = 0;

        for (int i = m; i < n; i++) {
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }

            s2count[s2.charAt(start) - 'a']--;
            start++;
            s2count[s2.charAt(i) - 'a']++;

        }
        return Arrays.equals(s1count, s2count);

        // through sorrting 
        //     if(m>n){
        //         return false;
        //     }

        //  s1=   sort(s1);
        //     for(int i=0;i<=n-m;i++){
        //         if(s1.equals(sort(s2.substring(i,i+m)))){
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

// Title: Permutation in String
