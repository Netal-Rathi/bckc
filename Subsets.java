import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(arr, nums, 0, ans); 
        return ans;
    }

    private void helper(List<Integer> arr, int[] nums, int index, List<List<Integer>> ans) {
       
        if (index == nums.length) {
            ans.add(new ArrayList<>(arr)); 
            return;
        }

        helper(arr, nums, index + 1, ans);

    
        arr.add(nums[index]);
        helper(arr, nums, index + 1, ans);
        arr.remove(arr.size() - 1); 
    }
}
