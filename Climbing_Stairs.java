import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            return 0;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int c1 = climbStairs(n - 1);
        int c2 = climbStairs(n - 2);
        
        memo.put(n, c1 + c2);
        return c1 + c2;
    }
}
