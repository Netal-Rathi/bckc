class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
           
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }else{
                    if(temp<count){
                        temp=count;
                        break;
                    }
                    break;
                }
               
               
               
            }
            if(temp<count){
                temp=count;
            }

            
        }
       
        return temp;
        
    }
}
// Title: Max Consecutive Ones
