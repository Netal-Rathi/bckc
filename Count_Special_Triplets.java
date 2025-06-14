class Solution {
    int count=0;
    public int specialTriplets(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        check(nums,list,0,set);
        return count;
        

        
        
    }

    public void check(int [] nums,List<Integer> list,int idx,Set<List<Integer>>set){
        if(list.size()==3 && !set.contains(list)){
                int i=list.get(0);
                int j=list.get(1);
                int k=list.get(2);
            if(i==j*2 && k==j*2){
                count++;
                set.add(list);
            }
            return;
        }

        if(list.size()==3){
            return;
        }
        for(int i=idx ;i<nums.length;i++){
            list.add(nums[i]);
            check(nums,list,idx+1,set);
            list.remove(list.size()-1);
        }
        
    }
}