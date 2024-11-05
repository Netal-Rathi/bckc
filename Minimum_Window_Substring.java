import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        
        // HashMap to store the frequency of characters in t
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int count = t.length();
        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    count--;
                }
                map.put(endChar, map.get(endChar) - 1);
            }
            end++;

            while (count == 0) {
                // Update the minimum window length
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                
                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        count++;
                    }
                }
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

// Title: Minimum Window Substring
