class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        
       
        for (int i = 0; i < k; i++) {
            totalSum += cardPoints[i];
        }
        
        int maxSum = totalSum;
        int left = k - 1; 
        int right = n - 1; 
        
       
        for (int i = 0; i < k; i++) {
            totalSum = totalSum - cardPoints[left] + cardPoints[right];
            maxSum = Math.max(maxSum, totalSum);
            left--;
            right--;
        }
        
        return maxSum;
    }
}
// Title: Maximum Points You Can Obtain from Cards
