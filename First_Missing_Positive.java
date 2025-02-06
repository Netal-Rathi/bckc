class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
       boolean [] ans=new boolean[n+1];
       for(int num:nums){
        if(num>0 && num<=n){
        ans[num]=true;
        }
       }
       for(int i=1;i<=n;i++){
        if(!ans[i]){
            return i;
        }
       }
       return n+1;
    }
}