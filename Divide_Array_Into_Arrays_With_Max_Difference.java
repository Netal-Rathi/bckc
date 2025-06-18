class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int [] [] ans=new int[n/3][3];
        int j=0;
//boolean check=false;

        for(int i=0;i<nums.length;i+=3){
            int arr[]=new int[3];  
           int a =nums[i];
            int b =nums[i+1];
           int c  =nums[i+2];

            if(Math.abs(a-b)<=k && Math.abs(c-b)<=k && Math.abs(a-c)<=k ){
                arr[0] = a;
               arr[1] = b;
               arr[2]  =c;

                ans[j]=arr;
                j++;
               // check=true;
            }else{
             return  new int[0][];
            }
           


        }
        return ans;
    }
}