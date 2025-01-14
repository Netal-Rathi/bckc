class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max_length = 0;
        String result = "";

        for (int i = 0; i < n; i++) { // Start index of substring
            for (int j = i + 1; j <= n; j++) { // End index of substring (exclusive)
                String ans = s.substring(i, j); // Substring from i to j-1
                if (isvalid(ans) && ans.length() > max_length) {
                    result = ans;
                    max_length = ans.length();
                }
            }
        }
        return result;
    }

    public Boolean isvalid(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
