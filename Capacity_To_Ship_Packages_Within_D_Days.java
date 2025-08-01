class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=1;
        int end=Integer.MAX_VALUE;
        int min=end;

        while(start<=end){
            int middle=start+ (end-start)/2;
            if(check(weights,days,middle)){
                min=middle;
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        return min;
        
    }

    public boolean check(int nums[], int days,int middle ){
        int count=0;
        int sum=0;

        for(int i : nums){
            sum+=i;
            if(sum==middle){
                count++;
                sum=0;
            }else if (sum>middle){
                count++;
               
                sum=i;
            }else {
                continue;
            }
        }
        if(sum<=middle){
            count++;
        }
        return count<=days;


    }
}
// Title: Capacity To Ship Packages Within D Days
