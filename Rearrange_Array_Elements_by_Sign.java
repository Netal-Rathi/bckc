class Solution {
      private int next_negative (int[] nums,int j){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]<0){
                    return i;
                }
            }
            return -1;
        }

         private int next_positive (int[] nums,int j){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]>0){
                    return i;
                }
            }
            return -1;
        }
    public int[] rearrangeArray(int[] nums) {
        
      

        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]>0 && nums[i+1]<0){
                continue;
            }else if(nums[i]>0 && nums[i+1]>0){
             int p=next_negative(nums,i);
             int temp=nums[p];
             for(int k=p;k>i+1;k--){
                nums[k]=nums[k-1];

               }
               nums[i+1]=temp;
                
            }else if(nums[i]<0 && nums[i+1]<0){
                int p=next_positive(nums,i);
               int temp=nums[p];
               
               for(int k=p;k>i+1;k--){
                nums[k]=nums[k-1];

               }
               nums[i+1]=nums[i];
               nums[i]=temp;




            }else{
                int temp=nums[i+1];
                nums[i+1]=nums[i];
                nums[i]=temp;
            }
        }



        
        return nums;

    }
}