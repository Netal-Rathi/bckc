class Solution {
    public long coloredCells(int n) {
        if(n==0){
            return 0;
        }

        long sum=1;
        for(int i=1;i<n;i++){
            sum+=4*i;
        }
        return sum;

        
    }
}