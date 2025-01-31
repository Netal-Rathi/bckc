class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       // int temp=0;
        for(int i=0 ;i<n;i++){
            for(int j=i+1;j<n;j++){
               int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        for(int k=0;k<n;k++){
            int i=0,j=n-1;
            while(i<j ){
                int var=matrix[k][i];
               matrix[k][i]= matrix[k][j];
               matrix[k][j]=var;
               i++;
               j--;
            }
           
        }
        
    }
}