class Solution {
    public long coloredCells(int n) {
        if(n==0){
            return 0;
        }
        
        return (n-1)*4 + 1;
        
    }
}