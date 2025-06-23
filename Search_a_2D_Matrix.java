class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int m=matrix.length;
            int n=matrix[0].length;
        int i=0;

        while(i<m){
            if(target<=matrix[i][n-1]){
                break;
            }else{
                i++;
            }
        }
if(i==m){
    return false;
}
        int start =0;
      int  end=n-1;

        while(start<=end){
            int middle=start+ (end-start)/2;
            if(target==matrix[i][middle]){
                return true;
            }else if (target>matrix[i][middle]){
                start=middle+1;

            }else{
                end=middle-1;
            }

        }
        
        return false;
    }
}
// Title: Search a 2D Matrix
