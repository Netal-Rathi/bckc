class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;

        int left = 1;
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (check(bloomDay, m, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public boolean check(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}
