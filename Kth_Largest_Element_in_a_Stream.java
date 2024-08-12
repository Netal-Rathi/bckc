import java.util.Arrays;

class KthLargest {
    private int k;
    private int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        Arrays.sort(this.nums);  // Sort the array
    }

    public int add(int val) {
        // Create a new array to accommodate the new value
        int[] newNums = new int[nums.length + 1];
        
        // Copy existing elements to the new array
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        
        // Add the new value
        newNums[nums.length] = val;

        // Sort the new array
        Arrays.sort(newNums);

        // Update the nums array to the newly sorted array
        nums = newNums;

        // Return the k-th largest element
        return nums[nums.length - k];
    }
}

// Title: Kth Largest Element in a Stream
