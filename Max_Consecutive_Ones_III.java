class Solution {
    public int longestOnes(int[] nums, int k) {
     int nzero=0,max_num=0,start=0;
   // int calc=0;
        for(int end=0;end<nums.length;end++){
           if(nums[end]==0){
           nzero++;
           }

            while(nzero>k){
                if(nums[start]==0){
                  
                    nzero--;
                }
                 // calc-=1;
                start++;
            }

            max_num=Math.max(max_num,end-start+1);
           

           }
            return max_num;

        }
       
        
    }

// Title: Max Consecutive Ones III
