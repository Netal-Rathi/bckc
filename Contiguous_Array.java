class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int maxlength=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count--;
            }else{
                count++;
            }
            if(map.containsKey(count)){
                maxlength=Math.max(maxlength,i-map.get(count));
            }else{
                map.put(count,i);
            }
        }
        return maxlength;
    }
}