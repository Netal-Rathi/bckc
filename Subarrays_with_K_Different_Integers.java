class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
          return atmost(nums,k)-atmost(nums,k-1);
    }

    public int atmost(int [] nums ,int k){
     //   int start=0,result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0,result=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.size()>k){
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                   
                }
                 start++;
            }
            result+=i-start+1;
        }
        return result;
    }
}