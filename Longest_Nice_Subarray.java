class Solution {
    public int longestNiceSubarray(int[] nums) {

       int maxsum=Integer.MIN_VALUE;
       int checker=0;
       int count=0;

       for(int left=0,right=0;right<nums.length-1;right++){
        while((checker & nums[right])!=0){
            checker =checker^nums[left];
            left++;
        }
            checker=checker | nums[right];
            count=right-left+1;
            maxsum=Math.max(count,maxsum);
       }
      
      
        return maxsum>1? maxsum : 1;
    }

   
}