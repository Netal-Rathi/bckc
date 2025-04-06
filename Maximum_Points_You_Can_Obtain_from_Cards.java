class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
    int maxsum=0,leftsum=0,left=k-1,rightsum=0;
    for(int i=0;i<k;i++){
       leftsum+=cardPoints[i];
    }

    
   for(int i=n-1;i>=n-k;i--){
   rightsum+=cardPoints[i];
   leftsum-=cardPoints[left];
   left--;
   maxsum=Math.max(maxsum,rightsum+leftsum);

   }
return maxsum;
    }
}