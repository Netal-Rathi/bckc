class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i;j<nums.length;j++){
                sum=0;
                for(int m=i;m<=j;m++){
                sum=sum+nums[m];
                }
                if(k==sum){
                count++;
            }
            }
            
        }
      
        return count;
        
    }
}
// Title: Subarray Sum Equals K
