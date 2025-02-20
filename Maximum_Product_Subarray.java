class Solution {
    public int maxProduct(int[] nums) {
        int res=1,final_res=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
                    res=res*nums[i];
                    final_res=Math.max(final_res,res);
                    if(res==0){
                        res=1;
                    }
                    
            }
      return final_res;
    }
}
// Title: Maximum Product Subarray
