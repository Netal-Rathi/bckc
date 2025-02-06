class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums.length<=2){
            for(int num:nums){
                ans.add(num);
            }
            return ans;

        }
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if( map.get(key)>nums.length/3){
                ans.add(key);
            }
        }
        return ans;
        
    }
}
// Title: Majority Element II
