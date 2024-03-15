class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int c = 0;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int zero = 0, one = 0;
                for (int k = i; k <= j; k++) { // Fixed range issue
                    if (nums[k] == 0) {
                        zero++;
                    } else {
                        one++;
                    }
                }
                if (zero == one) {
                    ans[c] = zero + one;
                    c++;
                }
            }
        }
        return Arrays.stream(ans).max().getAsInt();
    }
}

// Title: Contiguous Array
