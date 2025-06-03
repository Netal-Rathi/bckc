class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Important for handling duplicates
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        generate(nums, 0, list, ans);
        return new ArrayList<>(ans);
    }

    private void generate(int[] nums, int idx, List<Integer> list, Set<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list)); // Make a copy before adding
            return;
        }

        // Include the current element
        list.add(nums[idx]);
        generate(nums, idx + 1, list, ans);
        list.remove(list.size() - 1); // Backtrack

        // Exclude the current element
        generate(nums, idx + 1, list, ans);
    }
}

// Title: Subsets II
