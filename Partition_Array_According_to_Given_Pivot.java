class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     //   int count=0;
        int[] ans=new int[nums.length];
        int i=0,k=0,j=nums.length-1,l=nums.length-1;
        while(i<nums.length && j>=0){
            if(nums[i]<pivot){
                ans[k]=nums[i];
                k++;
                
            }

        if(nums[j]>pivot){
            ans[l]=nums[j];
            l--;
        }
        i++;
        j--;
        }
        for(int m=k;m<=l;m++){
            ans[m]=pivot;
        }
                    

                   return ans;
            
        }

    
}
// Title: Partition Array According to Given Pivot
