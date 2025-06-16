class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length-1;
        int start=0,end=n;

        while(start<=end){
            if(start!=n && nums[start]>nums[start+1]){
                return start;
            }else{
                start++;
            }

            if(end!=0 && nums[end]>nums[end-1]){
                return end;
            }else{
                end--;
            }

        }
        return -1;
    }
}
// Title: Find Peak Element
