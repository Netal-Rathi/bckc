class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    if(map.containsKey(nums[i])){
        map.put(nums[i],map.get(nums[i])+1);
    }else{
        map.put(nums[i],1);
    }
}
            int maxvalue=0;
            int maxno=0;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxvalue){
                maxvalue=entry.getValue();
                maxno=entry.getKey();
            }
        }
        return maxno;
    }
}
// Title: Majority Element
