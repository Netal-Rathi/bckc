class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        /*top --> right
        top++
        right--
        top --> bottom
        bottom--
        top++
        right-> left
        left++
        bottom--
        bottom top
        bottom--
        top++
        */     
        List<Integer> l1=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int n=matrix.length;
        int m =matrix[0].length;
     //   int j=0;

        while( left<=right && top<=bottom && l1.size()<n*m){
        for(int i=left;i<=right && l1.size()<n*m ;i++){
            l1.add(matrix[top][i]);
         //  j++;
        }
        top++;
        //right--;
            for(int i=top;i<=bottom && l1.size()<n*m ;i++){
                l1.add(matrix[i][right]);
            //    j++;
            }
            right--;
            for(int i=right;i>=left && l1.size()<n*m ;i--){
                l1.add(matrix[bottom][i]);
                //j++;
            }
            bottom--;
            for(int i=bottom;i>=top && l1.size()<n*m ;i--){
                l1.add(matrix[i][left]);
               // j++;
            }
            left++;
        }
        return l1;
    }
}
// Title: Spiral Matrix
