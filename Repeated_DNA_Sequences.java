import java.util.HashSet;
import java.util.Set;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       List<String> result = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();
        int n = s.length();
        
        for (int i = 0; i <= n - 10; i++) {
            String seq = s.substring(i, i + 10);
            countMap.put(seq, countMap.getOrDefault(seq, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

}