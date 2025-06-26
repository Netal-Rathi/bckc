class Solution {
    int maximum = 0;

    public int longestPalindromeSubseq(String s) {
        StringBuilder ans = new StringBuilder();
        check(s, 0, ans);
        return maximum;
    }

    public void check(String s, int i, StringBuilder current) {
        if (i == s.length()) {
            if (isPalindrome(current)) {
                maximum = Math.max(maximum, current.length());
            }
            return;
        }

        current.append(s.charAt(i));
        check(s, i + 1, current);
        current.deleteCharAt(current.length() - 1); 


        check(s, i + 1, current);
    }

    public boolean isPalindrome(StringBuilder sb) {
        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// Title: Longest Palindromic Subsequence
