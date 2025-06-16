class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            if(min<nums[i]){
                int sum=nums[i]-min;
               ans= Math.max(sum,ans);
            }

        }
        return ans;
        
    }
}