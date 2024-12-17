class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Result array to store the rearranged elements
        int posIndex = 0, negIndex = 1; // Start indexes for positive and negative numbers

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num; // Place positive numbers at even indices
                posIndex += 2;
            } else {
                result[negIndex] = num; // Place negative numbers at odd indices
                negIndex += 2;
            }
        }

        return result;
    }
}
