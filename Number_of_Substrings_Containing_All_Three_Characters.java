class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            // Expand window by adding s[end]
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            
            // Shrink window until it is no longer valid
            while (map.size() == 3) {
                count += (s.length() - end); // Count valid substrings
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                
                // Remove key if its frequency is 0
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                
                start++; // Move left pointer
            }
        }
        
        return count;
    }
}

// Title: Number of Substrings Containing All Three Characters
