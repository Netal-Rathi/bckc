class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int x=n%2;
        if(n==1){
            return mat[0][0];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i+j==n-1){
                    sum+=mat[i][j];
                }
                
            }
        }
        if(x!=0){
        sum-=mat[x][x];
        }
        return sum;
        
    }
}
// Title: Matrix Diagonal Sum
