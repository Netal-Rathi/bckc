class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int m=image.length;
        int n=image[0].length;
        Queue<int[]> q= new LinkedList<>();
         q.add(new int[]{sr,sc});
         int cl=image[sr][sc];
         image[sr][sc]=color;
         int  dir [][]=new int [][] {{0,1},{1,0},{-1,0},{0,-1}};

         while(!q.isEmpty()){
            int level=q.size();
            while(level-->0){
                int arr[] =q.poll();
                int x=arr[0];
                int y =arr[1];
                for(int [] d: dir){
                    int i=x+d[0];
                    int j=y+d[1];
                    if(i>=0 && i<m && j>=0 && j<n && image[i][j]==cl){
                        image[i][j]=color;
                        q.add(new int[] {i,j});
                    }
                }
            }
         }
        return image;
    }
}
// Title: Flood Fill
