class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int dp[][] = new int[text1.length()][text2.length()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return check(text1.length() - 1, text2.length() - 1, text1, text2, dp);

    }

    public int check(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;
        }
        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }
        if (s1.charAt(idx1) == s2.charAt(idx2)) {

            dp[idx1][idx2] = 1 + check(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            dp[idx1][idx2] = 0 + Math.max(check(idx1 - 1, idx2, s1, s2, dp), check(idx1, idx2 - 1, s1, s2, dp));
        }
        return dp[idx1][idx2]; 

    }
}
// Title: Longest Common Subsequence
