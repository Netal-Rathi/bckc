import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> list = new ArrayList<>();
        
        // Generate all possible subarray sums
        for (int i = 0; i < n; i++) {
            long sum = 0;  // Initialize sum for the current subarray starting at i
            for (int j = i; j < n; j++) {
                sum += nums[j];
                list.add(sum);
            }
        }
        
        // Sort the list of subarray sums
        Collections.sort(list);
        
        long ans = 0;
        
        // Sum the elements in the specified range
        for (int i = left - 1; i < right; i++) {
            ans += list.get(i);
        }
        
        return (int)(ans % 1000000007);
    }
}

// Title: Range Sum of Sorted Subarray Sums
