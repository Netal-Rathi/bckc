class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, valid = 0;
        int minLen = Integer.MAX_VALUE;
        int resultStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (target.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(target.get(c))) {
                    valid++;
                }
            }
            
            while (valid == target.size()) {
                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    resultStart = left;
                }
                
                // Shrink window from left
                char leftChar = s.charAt(left);
                if (target.containsKey(leftChar)) {
                    if (window.get(leftChar).equals(target.get(leftChar))) {
                        valid--;
                    }
                    window.put(leftChar, window.get(leftChar) - 1);
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(resultStart, resultStart + minLen);
    }
}
// Title: Minimum Window Substring
