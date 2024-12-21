class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer> row_h=new HashSet<>();
        HashSet<Integer> clm_h=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j]==0 ){
                     row_h.add(i);
                     clm_h.add(j);
                    
                }
            }
        }

                    for(int row:row_h){
              for(int l=0;l<n;l++){
                matrix[row][l]=0;
              }
                }


                for(int col:clm_h){
              for(int k=0;k<m;k++){
                matrix[k][col]=0;
              }
                }

             

             //   System.out.print(matrix);
            
        
     
    }
}