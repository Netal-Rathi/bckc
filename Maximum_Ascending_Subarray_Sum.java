class Solution {
    public int maxAscendingSum(int[] nums) {
        return helper(nums,0,0,0,0);
        
    }

    public int helper(int[] nums,int n,int sum,int i,int ans){
        if(n==nums.length){
            return Math.max(sum,ans);
        }

        if(n==0 || nums[n]>nums[n-1] ){
          sum= sum+nums[n];
          ans=Math.max(sum,ans);
       return  helper(nums,n+1,sum,i,ans);
        }else{
          return helper(nums,n+1,nums[n],n,ans);
        }
    //    return ans;
    }
}