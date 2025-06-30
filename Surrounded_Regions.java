class Solution {
    public void solve(char[][] board) {
        // sare o queue mei
        // maintain boolean check for all os 
        // check if its not corner/edge value 
            // if h toh break out of loop 
        // else check for all if baju mei x yao h toh convert inplace to x 

        int m=board.length;
        int n=board[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    q.offer(new int []{i,j});
                }
            }
        }

        int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};


        while(!q.isEmpty()){

                int [] arr=q.poll();
                int i=arr[0];
                int j=arr[1];
        boolean check;
        if(i!=m-1 && j!=n-1 && i!=0 && j!=0){
                for(int[] d: dir){
                    int x=i+d[0];
                    int y=j+d[1];

                    if(x>=0 && x<m &&  y>=0 && y<n){
                        board[x][y]='X';
                    }
                }
        }
        }
      //  return board ;
    }
}