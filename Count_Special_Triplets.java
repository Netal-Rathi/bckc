class Solution {
    public int specialTriplets(int[] nums) {
       int  count=0;
          int mod = 1_000_000_007;
        HashMap<Integer,Integer> prefix= new HashMap<>();
        HashMap<Integer,Integer> suffix=new HashMap<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            suffix.put(nums[i],suffix.getOrDefault(nums[i],0)+1);
            
        }

        for(int j=0;j< n ;j++){
            int k=nums[j];
             suffix.put(k,suffix.getOrDefault(k,0)-1);
            if(suffix.get(k)==0){
                suffix.remove(k);
            }
            int left=prefix.getOrDefault(k*2,0);
            int right=suffix.getOrDefault(k*2,0);
            count+=left*right;

            prefix.put(k,prefix.getOrDefault(k,0)+1);
        }
        return count%mod;
    }
}
// Title: Count Special Triplets
