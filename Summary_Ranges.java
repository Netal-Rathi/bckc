class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;

        int start = nums[0]; // Starting number of the current range

        for (int i = 1; i < nums.length; i++) {
            // If the sequence breaks
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(String.valueOf(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // Reset start to the new number
            }
        }

        // Handle the last range after loop
        if (start == nums[nums.length - 1]) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}
