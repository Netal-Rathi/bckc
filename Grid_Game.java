class Solution {
    public int[][] prefix_sum(int[][] grid){
    //    int n=grid.length;
        int n=grid[0].length;
        int k=0;
        int prefix [][]=new int[2][n];
        prefix[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            if(k==0){
                prefix[k][i]=prefix[k][i-1]+grid[k][i];

            }
        }
        k++;
        prefix[1][0]=grid[0][0]+grid[1][0];
        for(int i=1;i<n;i++){
            prefix[k][i]=Math.max(prefix[k][n-1] + grid[k][i] , prefix[0][i] + grid[k][i] );

        }
        return prefix;
      
    }


    public long gridGame(int[][] grid) {
        int n=grid[0].length;

  int prefix[][]= prefix_sum(grid);
  grid[1][n-1]=0;
  grid[0][0]=0;
       int l=n-2;
                while(l>=0){
          if(prefix[0][l+1]>prefix[1][l]){
                for(int i=l+1;i>0;i--){
                    grid[0][i]=0;
                    l--;
                }
        }else{
            grid[1][l]=0;
            l--;
        }
                }
System.out.println(Arrays.deepToString(grid));
   
        long sum=0;
        

        for(int i =n-1;i>0;i--){
            if(grid[0][i]>grid[1][i-1]){
                for(int j=i;j>=0;j--){
                sum+=grid[0][j];
                }
                break;
                
               
            }else{
                sum+=grid[1][i-1];
            }
        }
       // sum+=grid[1][n-1];
        return sum;
        
    }
}