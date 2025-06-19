class Solution {
    public int splitArray(int[] nums, int k) {
        int start = Arrays.stream(nums).max().getAsInt();
        int end = Arrays.stream(nums).sum();
        int result = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canSplit(nums, mid, k)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private boolean canSplit(int[] nums, int maxSumAllowed, int k) {
        int currentSum = 0;
        int subarrays = 1;

        for (int num : nums) {
            if (currentSum + num > maxSumAllowed) {
                subarrays++;
                currentSum = num;
                if (subarrays > k) return false;
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}

// Title: Split Array Largest Sum
