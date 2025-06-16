class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int middle=start + (end-start)/2;

while(start<=end){
        if(nums[middle]==target){
            return middle;
        }

        if(nums[start]<nums[middle]){
            //left part
            //end=middle-1;

            if(target>=nums[start] && target< nums[middle]){
               end=middle-1;
            }else{
                start=middle+1;

            }
        }else{
            //right part 
             if(target>nums[middle] && target<= nums[end]){
               start=middle+1;
            }else{
                end=middle-1;

            }
        }
        middle=start + (end-start)/2;

}
        return -1;
    }

 
}
// Title: Search in Rotated Sorted Array
