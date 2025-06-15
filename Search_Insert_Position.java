class Solution {
    public int searchInsert(int[] nums, int target) {
        //start==end==> +1
        //// if equal ==> middle -1
        

        int start=0,end=nums.length-1;
            int  middle=(end+start)/2;
        while(start<=end){
            
      
            if(target<nums[middle]){
                end=middle-1;

            }else if(target>nums[middle]){

                    start=middle+1;
            }else{
                return middle;
            }
             middle=(end+start)/2;
        }
        return start;
    }
}
// Title: Search Insert Position
