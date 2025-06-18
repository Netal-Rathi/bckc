class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end =Arrays.stream(nums).max().getAsInt();
       int min=end;

        while(start<=end){
            int middle=start+ (end-start)/2;

            if(check(nums,middle,threshold)){
                min=middle;
                end=middle-1;
            }else{
                start=middle+1;
            }

        }
        return min;


        
    }

    public boolean check(int [] nums,int middle,int thresh){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=(nums[i] + middle -1)/middle;

        }
        return sum<=thresh;

    }
}
// Title: Find the Smallest Divisor Given a Threshold
