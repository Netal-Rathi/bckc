
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> elemet=new HashSet<>();
        long maxsum=0,wsum=0;
        int b=0;
        for(int end =0;end<nums.length;end++){
            if(!elemet.contains(nums[end])){
                wsum+=nums[end];
                elemet.add(nums[end]);

                if(end-b+1==k){
                    maxsum=Math.max(wsum,maxsum);
                    wsum-=nums[b];
                    elemet.remove(nums[b]);
                    b++;
                   

                }

            }else{
                while(nums[b]!=nums[end]){
                    wsum-=nums[b];
                    elemet.remove(nums[b]);
                    b++;
                }
                b++;
            }


        }
        return maxsum;
    }

}
