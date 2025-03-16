import java.util.*;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1; 
        long right = (long) ranks[0] * (long) cars * (long) cars; /
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairAllCars(ranks, cars, mid)) {
                ans = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return ans;
    }

   
    private boolean canRepairAllCars(int[] ranks, int cars, long time) {
        long totalCars = 0;
        for (int rank : ranks) {
            totalCars += (long) Math.sqrt(time / rank); 
            if (totalCars >= cars) return true; 
        }
        return totalCars >= cars;
    }
}
