class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
       
        int start=Arrays.stream(weights).max().getAsInt();
        int end=Arrays.stream(weights).sum();
        int min=end;

        while(start<=end){
            int middle=start+ (end-start)/2;
            System.out.println(middle);
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
        if(sum!=0 && sum<middle){
            count++;
        }
        return count<=days;


    }
}