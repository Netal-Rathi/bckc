class Solution {
    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            return 0;
        }
        
        int c1 = climbStairs(n - 1);
        int c2 = climbStairs(n - 2);
        return c1 + c2;
    }
}

// Title: Climbing Stairs
