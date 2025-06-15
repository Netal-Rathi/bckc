class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int middle=(start+end)/2;
            while(start<=end){
        if(target<nums[middle]){
            end=middle-1;
        }else if(target>nums[middle]){
            start=middle+1;
        }else{
            return middle;
        }
                middle=(start+end)/2;
            }
            return -1;
        
    }
}
// Title: Binary Search
