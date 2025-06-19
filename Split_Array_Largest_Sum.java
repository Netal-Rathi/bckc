class Solution {
    int calcsum=0;
    public int splitArray(int[] nums, int k) {

        if(k>nums.length){
            return 0;
        }
    Arrays.sort(nums);
    
    int start=nums[0];
    int n=nums.length;
    int end=Arrays.stream(nums).sum();
    int min=end;

    while(start<=end){
        int middle =start + (end-start)/2;
        int arr[]=calcmax(nums,middle,n,k);
        if(arr[0]==1){
            min=Math.min(min,arr[1]);
            start=middle+1;
        }else{
            end=middle-1;
        }
    }
return min;
        
    }

    public int[] calcmax(int [] nums,int middle,int n,int k){
        int [] arr=new int[2];
        int s = n/k + n%k ;
        s=n-s;
        int i=n-1;
        int calcsum=0;
        while(i>=s && calcsum<middle){
            calcsum+=nums[i];
            i--;

        }
        if(calcsum>=middle){
            arr[0]=1;
            arr[1]=calcsum;
        }else{
            arr[0]=0;
            arr[1]=-1;
        }
        return arr;

    }
}
// Title: Split Array Largest Sum
