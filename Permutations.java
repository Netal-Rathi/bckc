import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutation(nums, new ArrayList<>(), result);
        return result;
    }

    private void findPermutation(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) continue; // Skip if the number is already in the current permutation
            current.add(nums[i]);
            findPermutation(nums, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    
}

// Title: Permutations
