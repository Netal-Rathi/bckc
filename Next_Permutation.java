class Solution {
    public void nextPermutation(int[] nums) {
      int count=0;
for(int i=1;i<nums.length-1;i++){
    if(nums[i]>nums[i+1]){
        count++;
    }else{
        int temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
        System.out.println(nums);
        break;

    }

    int n=nums.length;
    int j=n-1;
    int k=0;
    while(k<j){
      int alter=nums[k];
      nums[k]=nums[j];
      nums[j]=alter;
      j--; 
      k++;

    }
    System.out.println(nums);

}

    
}

}
    