class Solution {
    public int jump(int[] nums) {
        int i = 0, count = 0;
        int n = nums.length;
        if (n == 1) return 0;

        while (i < n - 1) {
            int j = nums[i];
            if (i + j >= n - 1) {
                count++;
                break;
            }

            int maxReach = 0;
            int k = 1;

            for (int t = 1; t <= j; t++) {
                if (i + t < n && i + t + nums[i + t] > maxReach) {
                    maxReach = i + t + nums[i + t];
                    k = t;
                }
            }

            i += k;
            count++;
        }

        return count;
    }
}
