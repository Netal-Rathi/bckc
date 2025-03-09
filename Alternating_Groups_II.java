class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        
        for (int i = 0; i <= n - k; i++) { // Ensuring `i + k - 1` is within bounds
            boolean isAlternating = true;
            
            // Check if the segment of length `k` is alternating
            for (int j = i; j < i + k - 1; j+=j+1%n) {
                if (colors[j] == colors[j + 1]) {
                    isAlternating = false;
                    break;
                }
            }
            
            if (isAlternating) {
                count++;
            }
        }
        return count;
    }
}
