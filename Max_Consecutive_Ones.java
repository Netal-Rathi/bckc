class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
           
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }else{
                   
                    break;
                }  
               
            }
            if(count==nums.length){
                return count;
            }
            if(temp<count){
                temp=count;
            }

            
        }
       
        return temp;
        
    }
}