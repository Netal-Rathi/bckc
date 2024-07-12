class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int ans = 0;

        if (x > y) {
            // Find and remove "ab" pairs first
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                    sb.delete(i, i + 2);
                    ans += x;
                    i -= 2; // Move back to handle overlapping pairs
                    if (i < -1) i = -1; // Prevent index from becoming negative
                }
            }
            // Find and remove "ba" pairs
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.delete(i, i + 2);
                    ans += y;
                    i -= 2; // Move back to handle overlapping pairs
                    if (i < -1) i = -1; // Prevent index from becoming negative
                }
            }
        } else {
            // Find and remove "ba" pairs first
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.delete(i, i + 2);
                    ans += y;
                    i -= 2; // Move back to handle overlapping pairs
                    if (i < -1) i = -1; // Prevent index from becoming negative
                }
            }
            // Find and remove "ab" pairs
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                    sb.delete(i, i + 2);
                    ans += x;
                    i -= 2; // Move back to handle overlapping pairs
                    if (i < -1) i = -1; // Prevent index from becoming negative
                }
            }
        }
        return ans;
    }
}

// Title: Maximum Score From Removing Substrings
