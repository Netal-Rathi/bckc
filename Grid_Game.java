class Solution {

    public long gridGame(int[][] grid) {
        long toprow=0;
        int n=grid[0].length;
    for(int i=0;i<n;i++){
        toprow+=grid[0][i];

    }
    long bottomrow=0;
    long minsum=Long.MAX_VALUE;

    for(int i=0;i<n;i++){
        toprow=toprow-grid[0][i];
        minsum=Math.min (minsum,
        Math.max(toprow,bottomrow));
        bottomrow+=grid[1][i];
    }
    return minsum;
    }
}
// Title: Grid Game
