import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        HashMap<Character, Integer> rn = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            rn.put(ransomNote.charAt(i), rn.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        // Compare character counts
        for (Map.Entry<Character, Integer> entry : rn.entrySet()) {
            if (!mag.containsKey(entry.getKey()) || entry.getValue() > mag.get(entry.getKey())) {
                return false;
            }
        }

        return true;
    }
}

// Title: Ransom Note
