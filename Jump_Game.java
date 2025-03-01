class Solution {
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i+nums[i]<nums.length){
                i=i+nums[i];
            }else{
                return false;
            }
        }
        return true ;
        
    }
}