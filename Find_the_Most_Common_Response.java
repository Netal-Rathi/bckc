import java.util.*;

class Solution {
    HashMap<String, Integer> map = new HashMap<>();

    public String findCommonResponse(List<List<String>> responses) {
        for (List<String> response : responses) {
            Set<String> uniqueWords = new HashSet<>();
            for (String word : response) {
                if (uniqueWords.add(word)) { // add() returns false if already exists
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        String mostCommon = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount || 
               (entry.getValue() == maxCount && entry.getKey().compareTo(mostCommon) < 0)) {
                maxCount = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }
}
