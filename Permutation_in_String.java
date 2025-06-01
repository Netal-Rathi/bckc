class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return isValid(s1, "", s2);
    }

    public boolean isValid(String s, String permutation, String check) {
        if (s.length() == 0) {
            return check.contains(permutation);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String sub = s.substring(0, i) + s.substring(i + 1);
            if (isValid(sub, permutation + c, check)) {
                return true;  // As soon as we find a match, return true
            }
        }

        return false; // If no permutation matches
    }
}
