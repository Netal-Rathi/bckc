class Solution {
    public long maxPoints(int[][] points) {
        long ans=0;
       // long max=Long.MIN_VALUE;
       int col1=-1;
       
     
   
        for(int i=0;i<points.length;i++){
              long max=Long.MIN_VALUE;
              int col2=-1;
            for(int j=0;j<points[i].length;j++){
                if(points[i][j]>max){
                    max=points[i][j];
                     col2=j;

                }

            }
           ans=ans+max;
            if(col1!=-1 ){
                ans=ans-Math.abs(col2-col1);
                
            }
            col1=col2;
        }
        return ans;
        
    }
}