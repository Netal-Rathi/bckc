class Solution {
    public long maxPoints(int[][] points) {
        long ans = 0;
        int col1 = -1;

        for (int i = 0; i < points.length; i++) {
            long max = Long.MIN_VALUE; // Reset max for each row
            int col2 = -1;

            for (int j = 0; j < points[i].length; j++) {
                if (points[i][j] > max) {
                    max = points[i][j];
                    col2 = j; // Set col2 to the current column index of the max value
                }
            }

            ans = ans + max;

            if (col1 != -1) {
                ans = ans - Math.abs(col2 - col1); // Subtract the difference between col2 and col1
            }

            col1 = col2; // Update col1 to the latest column of the max value
        }
        return ans;
    }
}
