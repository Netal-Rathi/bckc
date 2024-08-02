class Solution {
    public int minSwaps(int[] nums) {
      
        int n=nums.length;
        int current =0;
        int maxones=0;
        int one=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                 one++;
            }
        }

        if(one==0){
            return 0;
        }

        for(int i=0;i<one;i++){
            if(nums[i]==1){
                current++;
            }
            maxones=current;

        }

        for(int i=one;i<n+one;i++){
            if(nums[i%n]==1){
                current++;
            }

            if(nums[(i-one)%n]==1){
                current--;
            }
            maxones=Math.max(maxones,current);
           
                
           
        }
        System.out.println(one);
         System.out.println(maxones);

    
            return one-maxones;
       


         

        
    }

    
        
}
// Title: Minimum Swaps to Group All 1's Together II
