class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                count++;
                break;
            }
           
        }
        if(count==1){
            return nums[i];
        }
    
    }
      return -1;
}
 
}
// Title: Single Number
