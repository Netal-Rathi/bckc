class Solution {
    public int maxProduct(int[] nums) {
        int res=1,maxprod=Integer.MIN_VALUE,minprod=Integer.MAX_VALUE;
        //int ans=Intgere.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
                    res=res*nums[i];
                  
                    minprod=Math.min(res,minprod);
                      maxprod=Math.max(res,Math.max(minprod,maxprod));
                   
                    
                    
                    
            }
      return maxprod ;
    }
}
// Title: Maximum Product Subarray
