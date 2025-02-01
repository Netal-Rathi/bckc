class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        
        int parity = nums[0] % 2;  // Check the parity of the first element
        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != (i % 2 == 0 ? parity : 1 - parity)) {
                return false;
            }
        }
        
        return true;
    }
}

// Title: Special Array I
