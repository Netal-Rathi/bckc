class Solution {
    public int maximumCandies(int[] candies, long k) {
        // if(Arrays.stream(candies).sum()<k){
        //     return 0;
        // }
        int left=0;
        int right=Arrays.stream(candies).max().getAsInt();
        System.out.println(right);
  //   int ans=right;
        while(left<right){
           int mid=(left + right +1 )/2;
            if(checkmax(candies,k,mid)){
                left=mid;
                
             //   ans=right;

            }else{
               right=mid-1;

            }

        }
        return left;

        
    }

    public boolean checkmax(int[] candies,long k,int mid){
        long count=0;
        for(int i : candies){
          count+=i/mid;
        }
        return count>=k ;
    }
}
// Title: Maximum Candies Allocated to K Children
