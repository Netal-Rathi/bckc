class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                set.add(nums[i]^nums[j]);
            }
        }

        Set<Integer> ans=new HashSet<>();
       // int k=0;
        for(Integer i :set){
            for(int k:nums){
            ans.add(k^i);
           // k++;
            }
        }
        return ans.size();
    }
}