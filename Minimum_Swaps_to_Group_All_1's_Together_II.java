class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int current = 0;
        int maxOnesInWindow = 0;
        int totalOnes = 0;

        // Count the total number of 1s in the array
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // If there are no 1s, no swaps are needed
        if (totalOnes == 0) {
            return 0;
        }

        // Initialize the window with the first 'totalOnes' elements
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                current++;
            }
        }
        maxOnesInWindow = current;

        // Sliding the window across the circular array
        for (int i = totalOnes; i < n + totalOnes; i++) {
            if (nums[i % n] == 1) {
                current++;
            }
            if (nums[(i - totalOnes) % n] == 1) {
                current--;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, current);
        }

       

        return totalOnes - maxOnesInWindow;
    }
}

// Title: Minimum Swaps to Group All 1's Together II
