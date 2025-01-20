class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                list.add(i);
            }else{
                map.put(i,1);
            }

        }

        
        return list;

        
    }
}
// Title: Find All Duplicates in an Array
