class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length-1;
        int start=0,end=n;
        while(start<=end){

            if(start!= n && nums[start]==nums[start+1]){
                start++;
            }else{
                return nums[start];
            }

            if(end!=0 && nums[end]==nums[end-1]){
                end--;
            }else{
                return nums[end];
            }
            start++;
            end--;
        }
        return -1;
    }
}
// Title: Single Element in a Sorted Array
