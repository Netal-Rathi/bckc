class Solution {

    public int minZeroArray(int[] nums, int[][] queries) {
            int [] ans=new int[nums.length+1];
            int k=0,sum=0;
            for(int i=0;i<nums.length;i++){
                while(sum+ans[i]<nums[i]){
                    k++;
                    if(k>queries.length){
                        return -1;
                    }
                        int left=queries[k-1][0]  , right=queries[k-1][1]  , val=queries[k-1][2]  ;
                            if(right>=i){
                                ans[Math.max(left,i)]+=val;
                                ans[right+1]-=val;
                            }
                    

                        }
                        sum+=ans[i];
            }
            return k;
    }
}