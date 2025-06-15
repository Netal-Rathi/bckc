class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};

        int start=0,end=nums.length-1;
        int middle=(start  + end)/2;
        while(start<=end){
            
      
            if(target<nums[middle]){
                end=middle-1;

            }else if(target>nums[middle]){

                    start=middle+1;
            }else{
                if(nums[middle-1]==target){
                    arr[0]=middle-1;
                    arr[1]=middle;
                    return arr;
                }else if(nums[middle+1]==target){
                    arr[0]=middle;
                    arr[1]=middle+1;
                    return arr;
                }
            }
             middle=(end+start)/2;
        }
        return arr;
    }
}
// Title: Find First and Last Position of Element in Sorted Array
