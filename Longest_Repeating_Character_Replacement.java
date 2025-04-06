import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, maxLength = 0, maxCount = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            maxCount = Math.max(maxCount, map.get(currentChar));

        
            while (end - start + 1 - maxCount > k) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
// Title: Longest Repeating Character Replacement
