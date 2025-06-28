class Solution {
    public int orangesRotting(int[][] grid) {
        int m= grid.length;//rows
        int n=grid[0].length;//coloumns 
        int one=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        q.add(new int[]{i,j});
                    }

                    if(grid[i][j]==1){
                        one++;
                    }
            }
        }

        if(one==0){
            return 0;
        }
        int min=0;

      int  count=0;
            int [][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int level=q.size();
            boolean rotmin=false;
            while(level-->0){
                int arr[]=q.poll();
                int x=arr[0];
                int y=arr[1];

                for(int[] d: dir){
                    int i=x+d[0];
                    int j=y+d[1];

            if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {  

                        grid[i][j]=2;
                        q.add(new int[]{i,j});
                        count++;
                        rotmin=true;

                    }
                }
     

            }
            if(rotmin){
           min++;
            }
        }

        return one==count?min:-1;
    }
}