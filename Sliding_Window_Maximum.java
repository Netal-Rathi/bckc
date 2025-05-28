class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList <Integer> list=new ArrayList<>();
         ArrayList <Integer> ans=new ArrayList<>();
       // int maxelem=Integer.MIN_VALUE;
            for(int i=0;i<k;i++){
             //   maxelem=Math.max(maxelem,nums[i]);
             list.add(nums[i]);
            }
           ans.add(Collections.max(list));
            int start=0;

            for(int i=k;i<nums.length;i++){
                list.remove(0);
                    start++;
                    list.add(nums[i]);
                     ans.add(Collections.max(list));

            }
            return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}