class Solution {
    private int next_negative(int[] nums, int j) {
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                return i;
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    private int next_positive(int[] nums, int j) {
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }
        return -1; // Return -1 if no positive number is found
    }

    public int[] rearrangeArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            while (!(nums[i] > 0 && nums[i + 1] < 0)) {
                if (nums[i] > 0 && nums[i + 1] > 0) {
                    int p = next_negative(nums, i + 1);
                    if (p == -1) break; // No further negatives
                    // Instead of shifting elements one by one, swap directly
                    int temp = nums[p];
                    nums[p] = nums[i + 1];
                    nums[i + 1] = temp;

                } else if (nums[i] < 0 && nums[i + 1] < 0) {
                    int p = next_positive(nums, i + 1);
                    if (p == -1) break; // No further positives
                    // Instead of shifting elements one by one, swap directly
                    int temp = nums[p];
                    nums[p] = nums[i + 1];
                    nums[i + 1] = temp;

                } else {
                    // If mismatched, swap directly
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }
}
