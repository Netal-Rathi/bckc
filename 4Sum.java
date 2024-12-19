class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       int n=nums.length;
       
       Set<List<Integer>> s1=new HashSet<>();
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){  
                for(int l=k+1;l<n;l++){
                    int sum= nums[i]+nums[j]+nums[k];
                  //  sum=sum+nums[k];
                    sum=sum+nums[l];
                     if(sum==target){
                    List<Integer> li=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                       Collections.sort(li);
                            s1.add(li);
                }
                }
               
            }
        }
       }
       List<List<Integer>> ans =new ArrayList<>(s1);
       return ans;
    }
}