class Solution {
    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        int[] lcp = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            lcp[i] = lcpcalc(words[i], words[i + 1]);
        }

        int[] prefix = new int[n - 1];
        int[] suffix = new int[n - 1];

        prefix[0] = lcp[0];
        for (int i = 1; i < n - 1; i++) {
            prefix[i] = Math.max(prefix[i - 1], lcp[i]);
        }

        suffix[n - 2] = lcp[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], lcp[i]);
        }

        for (int i = 0; i < n; i++) {
            int max = 0;

            if (i - 2 >= 0) {
                max = Math.max(max, prefix[i - 2]);
            }

            if (i + 1 <= n - 2) {
                max = Math.max(max, suffix[i + 1]);
            }

            if (i > 0 && i < n - 1) {
                max = Math.max(max, lcpcalc(words[i - 1], words[i + 1]));
            }

            ans[i] = max;
        }

        return ans;
    }

    public int lcpcalc(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) return i;
        }
        return len;
    }
}

// Title: Longest Common Prefix Between Adjacent Strings After Removals
