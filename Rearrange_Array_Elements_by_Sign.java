class Solution {
    public int[] rearrangeArray(int[] nums) {
       int s=nums.length;
       int result[]=new int[s];
       int p=0;
       int n=1;
       for(int i=0;i<s;i++){
        if(nums[i]>0){
            result[p]=nums[i];
            p+=2;
        }else{
            result[n]=nums[i];
            n+=2;
        }
       }
       return result;
    }
}
