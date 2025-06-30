class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        int m=mat.length;
        int n=mat[0].length;

        //find 0  s and put it in queue (multilevel dfs )
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[] {i,j});
                }else{
                    mat[i][j]=-1;
                }
            }

        }

        // start bfs 
        int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};   
        while (!q.isEmpty()){
            int [] arr= q.poll();
            //int x=arr[0];
            int i=arr[0];
            int j=arr[1];
            for(int[] d : dir){
                int x=i+d[0];//i
                int y=j + d[1];//j

                if(x>=0 && x< m && y >=0 && y<n && mat[x][y]==-1){
                    mat[x][y]=mat[i][j]+1;
                    q.offer(new int [] {x,y});
                }

            }

        

        }
        return mat;
        
    }
}
// Title: 01 Matrix
