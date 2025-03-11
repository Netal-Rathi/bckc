class Solution {

    public int numberOfSubstrings(String s) {
        int len = s.length();
        // Track last position of a, b, c
        int[] lastPos = { -1, -1, -1 };
        int total = 0;

        for (int pos = 0; pos < len; pos++) {
            // Update last position of current character
            lastPos[s.charAt(pos) - 'a'] = pos;

            total += 1 + Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
        }

        return total;
    }
}