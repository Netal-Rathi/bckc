class Solution {
    public int uniqueXorTriplets(int[] nums) {
     //   int i=0,j=0,k=0;
        Set<Integer> ans=new HashSet<>();
        calculate(ans,nums,0,0,0);
        return ans.size();
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         for(int k=j;k<nums.length;k++){
        //             ans.add(nums[i]^nums[j]^nums[k]);
        //         }
        //     }
        // }
        // return ans.size();
        
    }
    
    public void calculate(Set<Integer> ans ,int nums[],int i,int j ,int k ){
        if(i>=nums.length-1 || j>=nums.length-1 || k>=nums.length-1){
            return;
        }
                ans.add(nums[i] ^ nums[j] ^ nums[k]);
        
        if(k<nums.length-1){

        //first element fixedj+1
        
        
        calculate(ans,nums,i,j,k+1);
        }else if (j<nums.length-1) {
        
        //secon;
        calculate(ans,nums,i,j+1,j+1);
            
        }else{
            calculate(ans,nums,i+1,i+1,i+1);
        }
        
        
        
    }
}