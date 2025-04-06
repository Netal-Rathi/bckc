class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Equivalent to vector<int> cou(26, 0)
        int n = s.length();
        int ans = 0;
        if (n <= k) {
            return n;
        }
        int left = 0, right = 0;
        int maxFreq = 0;
        
        while (right < n) {
            char ch = s.charAt(right);
            count[ch - 'A']++;
            right++;
            maxFreq = Math.max(count[ch - 'A'], maxFreq);

            if ((right - left - maxFreq) > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}