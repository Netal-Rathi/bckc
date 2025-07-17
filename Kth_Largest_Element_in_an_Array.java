class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
     //   int n=nums.length-1;
        int count=1,i=nums.length-1;
        while(count!=k && i>=1){
            if(nums[i]>=nums[i-1]){
                count++;
            }
            i--;

        }
        return nums[i];
        
    }
}