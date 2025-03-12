class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int count=0;
        for(int [] arr : queries){
            for(int i=arr[0];i<=arr[1];i++){
                if(arr[2] >= nums[i]){
                    nums[i]=0;
                }else{
                    nums[i]=nums[i]-arr[2];
                }
            }
            count++;
            if(iszero(nums)){
                return count;
            }
        }
        return iszero(nums)? count : -1;
    }
    public boolean iszero(int [] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                    return false;
            }
        }
        return true;
    }
}