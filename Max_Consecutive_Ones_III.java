class Solution {
    public int longestOnes(int[] nums, int k) {
        int temp=0;
        int max_num=0,start=0;
    int calc=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==1 ){
                calc++;
            }else{
                if(nums[end]==0){
                    temp++;
                    calc++;
                  
                }
            }

            while(temp>k){
                if(nums[start]==0){
                  
                    temp--;
                }
                  calc-=1;
                start++;
            }

            max_num=Math.max(max_num,calc);
           

           }
            return max_num;

        }
       
        
    }
