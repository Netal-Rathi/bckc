class Solution {
    public int jump(int[] nums) {
        
        int i=0,count=1;
        int n=nums.length;
        if(n==1){
            return 0;
        }
        while(i<n){
            int j=nums[i];
            int temp=j;
             int k=j;
            if(nums[i+j]==n-1){
                return count++;
            }else{
                
                int max=nums[i+temp];
               
                while(temp>0){
                    if(nums[i+temp]>max){
                        k=temp;
                     //   temp--;
                    }
                    temp--;
                    
                }

                count++;
            }
            i+=k;
        }
        return count;
        
    }
}