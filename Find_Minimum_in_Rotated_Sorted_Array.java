class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        int min=Integer.MAX_VALUE;


        while(start<=end){
            int middle=start + (end-start)/2;
            if(nums[start]<=nums[middle]){
                min=Math.min(min,nums[start]);
                start=middle+1;

            }else{

                    min=Math.min(min,nums[middle]);
                    end=middle-1;
            }
            
        }
        return min;
        
    }
}
// Title: Find Minimum in Rotated Sorted Array
