class Solution {
    public int sumSubarrayMins(int[] arr) {
        int modul=1000000007;
        int n=arr.length,start=0,sum=0,minval=Integer.MAX_VALUE;
         while(start<n-1){
            minval=arr[start];
            sum+=minval%modul;
            for(int end=start+1;end<n;end++){
              minval=  Math.min(minval,arr[end]);
                 sum+=minval%modul;

            }
         
            start++;

         }
         System.out.println(start);
           return sum+arr[start]%modul;
    }
 
}