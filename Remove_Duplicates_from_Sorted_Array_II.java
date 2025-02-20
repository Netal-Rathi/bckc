class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        TreeMap <Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;

          for(int key: map.keySet()){
           if(map.get(key)==1){
           nums[i++]=key;
          // i++;
           ans++;
           }else{
            nums[i++]=key;
            nums[i++]=key;
            ans+=2;
           }
          }
            return ans;
       
    }
}
// Title: Remove Duplicates from Sorted Array II
