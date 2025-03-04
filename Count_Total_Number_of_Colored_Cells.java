class Solution {
    public long coloredCells(int n) {
        if(n==0){
            return 0;
        }

       return 1 + (n)* (n-1) * 2;
        
    }
}