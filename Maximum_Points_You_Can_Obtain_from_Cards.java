class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
    int maxsum=0,leftsum=0,left=k-1,rightsum=0,right=n-1;
    for(int i=0;i<k;i++){
       leftsum+=cardPoints[i];
    }
    maxsum=leftsum+rightsum;
    int temp=0;

    while(temp<k){
        rightsum+=cardPoints[right];
        leftsum-=cardPoints[left];
        left--;
        temp++;
        right--;
        maxsum=Math.max(maxsum,leftsum+rightsum);
    }
    

return maxsum;
    }
}
// Title: Maximum Points You Can Obtain from Cards
