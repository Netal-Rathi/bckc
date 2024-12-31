class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // Handle empty array

        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i); // Take the i-th character from the first string
            for (int j = 1; j < strs.length; j++) { // Compare with all other strings
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return ans; // Return the common prefix so far if characters don't match
                }
            }
            ans += currentChar; // Append the current character to the answer
        }

        return ans; // Return the full common prefix
    }
}

// Title: Longest Common Prefix
