class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
if(nums.length==0){
    return list;
}
        int start=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                    if(start!=nums[i-1]){
                        list.add(start + "->" + nums[i-1]);
                       // start=nums[i];
                        
                    }else{
                        list.add(String.valueOf(start));
                       // start=nums[i];
                    }
                    start=nums[i];
            }

        }
        if(start==nums[nums.length-1]){
            list.add(String.valueOf(start));
        }else{
            list.add(start + "->" + nums[nums.length-1]);
        }
  
        return list;
    }
}
// Title: Summary Ranges
