class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length/2;
        System.out.println(n);
        System.out.println(nums[n]);
        if(nums[n]<=target){
            for(int i=n;i<nums.length;i++){
                if(target==nums[i]){
                    return i;
                }else if(nums[i]>target){
                    return i;
                }else{
                    continue;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(target==nums[i]){
                    return i;
                }else if(nums[i]> target){
                    return i;
                }else{
                    continue;
                }
            }
        }
       return target>nums[nums.length-1] ? nums.length:  0;
    //    return nums.length;
    }
}
// Title: Search Insert Position
