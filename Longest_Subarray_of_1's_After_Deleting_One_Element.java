class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,max_count=0,count=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    x++;
                //    count+=1;
                }
                count++;

                while(x>1){
                    if(nums[left]==0){
                        x--;
                    }
                
                    count--;
                    left++;
                }
                max_count=Math.max(count,max_count);

        }
        return max_count-1;
    }
}
// Title: Longest Subarray of 1's After Deleting One Element
