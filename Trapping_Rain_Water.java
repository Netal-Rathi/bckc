import java.util.*;

class Solution {
    public int trap(int[] height) {
        Stack<int[]> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < height.length; i++) {
            int currHeight = height[i];

            // Process while stack is not empty and current height is greater than top of stack
            while (!stack.isEmpty() && currHeight > stack.peek()[0]) {
                int[] bottom = stack.pop();
                if (stack.isEmpty()) break;

                int distance = i - stack.peek()[2] - 1;
                int boundedHeight = Math.min(currHeight, stack.peek()[0]) - bottom[0];
                sum += distance * boundedHeight;
            }

            // push: [height, visited (0/1), index]
            stack.push(new int[]{currHeight, 0, i});
        }

        return sum;
    }
}

// Title: Trapping Rain Water
