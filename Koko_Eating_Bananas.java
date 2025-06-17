import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        int minSpeed = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                minSpeed = mid;
                right = mid - 1; // Try to find a smaller speed
            } else {
                left = mid + 1;
            }
        }

        return minSpeed;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k; // ceiling without using Math.ceil
        }
        return totalHours <= h;
    }
}

// Title: Koko Eating Bananas
