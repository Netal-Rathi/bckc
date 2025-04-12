class Solution {
    public int uniqueXorTriplets(int[] nums) {
     //   int i=0,j=0,k=0;
        Set<Integer> ans=new HashSet<>();
//         calculate(ans,nums,0,0,0);
//         return set.size();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    ans.add(nums[i]^nums[j]^nums[k]);
                }
            }
        }
        return ans.size();
        
    }
    
//     public set<Integer> calculte(Set<Integer> ans ,int nums[],int i,int j ,int k ){
//         if(i==nums.length-1 || j==nums.length-1 || k==nums.length-1){
//             return;
//         }
        
//         ans.add(nums[i] ^ nums[j] ^ nums[k]);
//         //first element fixedj+1
        
//         j=j+1;
//         return (ans,nums,i,j,k);
        
//         //secon element fixed 
//         k=k+1;
//         return (ans,nums,i,j,k);
        
        
        
//     }
}