class Solution {
    public int jump(int[] nums) {
        int n=nums.length,sum=0,len=0;
        
        for(int i=0;i<n;i++){
            if(sum>=n){
                return len;
            }
                sum+=nums[i];
                len++;

        }
        return len;
        
    }
}
// Title: Jump Game II
