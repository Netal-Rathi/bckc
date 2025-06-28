class Solution {
    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        if (n == 1) return ans;

        int[] lcp = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            lcp[i] = getLCP(words[i], words[i + 1]);
        }

        int[] prefixMax = new int[n - 1];
        int[] suffixMax = new int[n - 1];

        prefixMax[0] = lcp[0];
        for (int i = 1; i < n - 1; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], lcp[i]);
        }

        suffixMax[n - 2] = lcp[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], lcp[i]);
        }

        for (int i = 0; i < n; i++) {
            int maxLCP = 0;

            if (i - 2 >= 0) maxLCP = Math.max(maxLCP, prefixMax[i - 2]);
            if (i + 1 <= n - 2) maxLCP = Math.max(maxLCP, suffixMax[i + 1]);
            if (i > 0 && i < n - 1) {
                maxLCP = Math.max(maxLCP, getLCP(words[i - 1], words[i + 1]));
            }

            ans[i] = maxLCP;
        }

        return ans;
    }

    private int getLCP(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) return i;
        }
        return len;
    }
}
