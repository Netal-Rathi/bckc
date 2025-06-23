class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m= mat.length;//row
        int n=mat[0].length;// coloumn 

            int low=0,high=n-1;
            while(low<=high){
                    int middle=low+(high-low)/2;
                    int max=findmax(mat,middle);
                    int left=(middle!=0)?mat[max][middle-1]:-1;
                    int right=(middle!=n-1)?mat[max][middle+1]:-1;

                    if(mat[max][middle]>left && mat[max][middle]>right){
                        return new int[]{max,middle};
                    }else if(mat[max][middle]<left){
                        high=middle-1;
                    }else{
                        low=middle+1;
                    }

            }
            return new int []{-1,-1};
    }

        
    

    public int findmax(int[][] mat ,int col){
        int n=mat.length;
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<n;i++){
          //  max=Math.max(max,mat[i][col]);
                if(mat[i][col]>max){
                        max=mat[i][col];
                        j=i;
                }
        }
        return j;

    }
}
// Title: Find a Peak Element II
