class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start=0,prefixsubarray=0,oddcount=0,result=0;

        for(int end=0;end<nums.length;end++){
            if(nums[end]%2!=0){
                oddcount++;
              prefixsubarray=0;
            }

            while(oddcount==k){
                if(nums[start]%2!=0){
                    oddcount--;
                }

                prefixsubarray++;
                start++;
            }
            result+=prefixsubarray;
        }
        return result;
    }
}