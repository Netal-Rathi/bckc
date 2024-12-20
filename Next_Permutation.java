import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int count = 0;

        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            }
        }


        if (count == 0) {
            Arrays.sort(nums);
            return;
        }
int i;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                for(int j=nums.length-1;j>=i;j--){
                    int temp=nums[j];
                    nums[j]=nums[i-1];
                    nums[i-1]=temp;
                    break;
                }
                break;
            }
        }

        
        Arrays.sort(nums, i, nums.length);
    }
} 
// Title: Next Permutation
