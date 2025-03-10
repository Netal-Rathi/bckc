class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength=Integer.MAX_VALUE, start=0,sum=0,sumlen=0;
        for(int end=0;end<nums.length ; end++ ){
            sum+=nums[end];
            sumlen=end-start+1;
            
            
            while(start<=end && sum>=target){
                   System.out.println(sumlen);
                      System.out.println(sum);
                minlength=Math.min(minlength,sumlen);
                sum-=nums[start];
                start++;
                sumlen=end-start+1;
            }
            


        }
        return minlength!=Integer.MAX_VALUE? minlength : 0;

        
    }
}