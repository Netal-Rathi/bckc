class Solution {

    public int checker(int i,int j,int m,int n){
        if(i==n || j==m){
            return 0;
        }
         if(i==n-1 || j==m-1){
            return 1;
        }

        int down=checker(i+1,j,m,n);
        int up=checker(i,j+1,m,n);
        return down+up;

    }
    public int uniquePaths(int m, int n) {

            return checker(0,0,m,n);
        
    }
}
// Title: Unique Paths
