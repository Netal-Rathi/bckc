class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return helper(nums,0,1,1,0);
    }
    public int helper(int [] nums ,int i,int n,int count,int ans){
            if(n==nums.length || i== nums.length){
                return Math.max(count,ans);
            }

            if(nums[n]==nums[n-1]+1){
                count++;
               return helper(nums,i,n+1,count,ans);
            }
           return helper(nums,n,n+1,1,Math.max(count,ans));

    //       return ans ;
    }
}