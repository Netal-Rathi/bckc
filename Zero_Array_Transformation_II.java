class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if(iszero(nums)){
            return 0;
        }
        int count=0;
        int [] temp=java.util.Arrays.copyOf(nums,queries.length);
        for(int [] arr : queries){
            for(int i=arr[0];i<=arr[1];i++){
                if(arr[2] >= nums[i]){
                    nums[i]=0;
                }else{
                    nums[i]=nums[i]-arr[2];
                }
            }
            if(!Arrays.equals(temp,nums)){
            count++;
            }
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
// Title: Zero Array Transformation II
