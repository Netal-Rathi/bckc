class Solution {

    // Helper method to find the next negative number's index
    private int next_negative(int[] nums, int j) {
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                return i;
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    // Helper method to find the next positive number's index
    private int next_positive(int[] nums, int j) {
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }
        return -1; // Return -1 if no positive number is found
    }

    public int[] rearrangeArray(int[] nums) {
        // Main loop for rearranging
        for (int i = 0; i < nums.length - 1; i += 2) {
            while (!(nums[i] > 0 && nums[i + 1] < 0)) {
                // If both are positive
                if (nums[i] > 0 && nums[i + 1] > 0) {
                    int nextNegIndex = next_negative(nums, i + 1);
                    if (nextNegIndex == -1) break; // No further negatives
                    int temp = nums[nextNegIndex];
                    nums[nextNegIndex] = nums[i + 1];
                    nums[i + 1] = temp;

                // If both are negative
                } else if (nums[i] < 0 && nums[i + 1] < 0) {
                    int nextPosIndex = next_positive(nums, i + 1);
                    if (nextPosIndex == -1) break; // No further positives
                    int temp = nums[nextPosIndex];
                    nums[nextPosIndex] = nums[i + 1];
                    nums[i + 1] = temp;

                // If mismatched, swap them
                } else {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }
}
