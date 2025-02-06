class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return helper(nums,0,0,0);
    }
    public int helper(int [] nums ,int n,int count,int ans){
            if(n==nums.length ){
                return Math.max(count,ans);
            }
            

            if( n==0 || nums[n]==nums[n-1]+1 ){
                count++;
               return helper(nums,n+1,count,ans);
            }
           return helper(nums,n+1,1,Math.max(count,ans));

    //       return ans ;
    }
}
// Title: Longest Consecutive Sequence
