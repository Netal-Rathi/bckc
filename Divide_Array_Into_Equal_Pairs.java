class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=nums.length/2;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry <Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                return false;

            }

        }
        return true ;
        
    }
}