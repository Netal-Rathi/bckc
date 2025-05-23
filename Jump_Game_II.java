class Solution {
    public int jump(int[] nums) {
        int n=nums.length,sum=0,len=0;
        if(n==1){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            if(sum>=n-1){
                return len;
            }
                sum+=nums[i];
                len++;

        }
        return len;
        
    }
}
// Title: Jump Game II
