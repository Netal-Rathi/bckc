class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Map.Entry<Integer, Integer> maxentry = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        // int dom=Collections.max(nums);
        int dom=maxentry.getKey();
        int domval=maxentry.getValue();
        int n=nums.size();
        int left=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==dom){
                left++;
                if(left*2>(i+1) && (domval-left)*2>(n-i-1) ){
                    return i;

                }
            }
           
                
                

            }
            return-1;
        }

}

