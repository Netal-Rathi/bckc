import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of elements in target
        for (int num : target) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Decrease frequencies based on arr
        for (int num : arr) {
            if (!map.containsKey(num)) {
                return false;
            }
            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
        
        // Check if all counts are zero
        return map.isEmpty();
    }
}
