import java.util.Arrays;
import java.util.Stack;

class Solution {
    public long subArrayRanges(int[] nums) {
        long sumMax = maximum(nums);
        long sumMin = minimum(nums);
        return sumMax - sumMin;
    }

    public long minimum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        Stack<Integer> stack = new Stack<>();
        // Left pass: find previous smaller element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] <= nums[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        // Right pass: find next smaller element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ((long)(i - left[i]) * (right[i] - i)) * nums[i];
        }
        return sum;
    }

    public long maximum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        Stack<Integer> stack = new Stack<>();
        // Left pass: find previous greater element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        // Right pass: find next greater element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ((long)(i - left[i]) * (right[i] - i)) * nums[i];
        }
        return sum;
    }
}
// Title: Sum of Subarray Ranges
