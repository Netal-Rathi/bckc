class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int n=nums.length-1;

        int start=0,end=n;
        int middle=(start  + end)/2;
        while(start<=end){
            
      
            if(target<nums[middle]){
                end=middle-1;

            }else if(target>nums[middle]){

                    start=middle+1;
            }else{
                int temp=middle;
                while(temp!=0 && nums[temp-1]==target){
                    temp--;
                }
                arr[0]=temp;
                while(middle!=n && nums[middle+1]==target){
                    middle++;
                }
                arr[1]=middle;
                return arr;
            }
             middle=(end+start)/2;
        }
        return arr;
    }
}
// Title: Find First and Last Position of Element in Sorted Array
