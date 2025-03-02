import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> list = new HashMap<>();
        
        // Store indices of each number
        for (int i = 0; i < nums.length; i++) {
            if (!list.containsKey(nums[i])) {
                list.put(nums[i], new ArrayList<>());
            }
            list.get(nums[i]).add(i);
        }

        // Check for nearby duplicates
        for (Map.Entry<Integer, List<Integer>> entry : list.entrySet()) {
            List<Integer> v = entry.getValue();
            
            // Check all pairs of indices to see if difference is ≤ k
            for (int j = 1; j < v.size(); j++) {
                if (Math.abs(v.get(j) - v.get(j - 1)) <= k) {
                    return true;
                }
            }
        }

        return false;
    }

 
}

// Title: Contains Duplicate II
