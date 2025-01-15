import java.util.*;

class Solution {

    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                sum += calc(s.substring(i, j + 1));
            }
        }
        return sum;
    }

    public int calc(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(map.values());
        int max = Collections.max(frequencies); // Maximum frequency
        int min = Collections.min(frequencies); // Minimum frequency
        return max - min; // Difference between max and min frequency
    }
}

// Title: Sum of Beauty of All Substrings
