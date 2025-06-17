class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }
        
        int start=1;
        int end=Arrays.stream(bloomDay).max().getAsInt();
        int min=-1;
        while(start<=end){
            int middle=start+ (end-start)/2;

            if(check(bloomDay,m,k,middle)){
                min=middle;
                System.out.println(min);
                end=middle-1;
            }else{
                start=middle +1;
            }
        }
        return min;

        
    }

    public boolean check(int arr[] ,int m ,int k,int mid){
        int b=0;
        int flowers=0;
      //  Arrays.sort(arr);
       
        for(int i : arr){
           if(i<=mid){
            flowers++;
            if(flowers==k){
                b++;
                flowers=0;
            }
           }else{
            flowers=0;
           }
            
            
        }
        
        return b>=m;


    }
}