class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;
        int totalSubsets = 1 << n;

       
        for (int mask = 1; mask < totalSubsets - 1; mask++) {
            long prod1 = 1;
            long prod2 = 1;

           
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    prod1 *= nums[i];
                } else {
                    prod2 *= nums[i];
                }
                
                if (prod1 > target || prod2 > target) break;
            }

            if (prod1 == target && prod2 == target) {
                return true;
            }
        }

        return false;
    }
}

// Title: Partition Array into Two Equal Product Subsets
