class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int temp=target;
            temp=temp-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                    
                }


            }
        }
        return arr;
    }

}
// Title: Two Sum
