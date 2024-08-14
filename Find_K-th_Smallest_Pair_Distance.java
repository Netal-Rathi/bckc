class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               ans.add( dist(nums[i],nums[j]));
            }

        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
    public int dist(int a,int b){
        int ans=Math.abs(b-a);
        return ans;
    }
}