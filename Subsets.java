import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        helper(nums, arr, i, ans);
        return ans;
    }

    public void helper(int[] nums, List<Integer> arr, int i, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        helper(nums, arr, i + 1, ans);
        arr.add(nums[i]);
        helper(nums, arr, i + 1, ans);
        arr.remove(arr.size() - 1);

    }
}

// Title: Subsets
