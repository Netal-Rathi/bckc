class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans=1;
        int n=nums.length;
        int [] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                    if(nums[j]<nums[i]){
                        dp[i]=Math.max(dp[i],dp[j]+1);
                        ans=Math.max(ans,dp[i]);
                    }
            }

        }
        return ans ;
    }
}
// Title: Longest Increasing Subsequence
