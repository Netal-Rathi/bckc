class Solution {
    int count=0;
    public int findCircleNum(int[][] isConnected) {
        
        int visited[]=new int[isConnected.length];
        Arrays.fill(visited,-1);

        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==-1){
                dfs(i,isConnected,visited);
                   count++;

            }
        }
        return count;

    }

    public void dfs (int node,int[][] connected,int [] visited){
       
            //add
            visited[node]=1;
        for(int i=0;i<connected[0].length;i++){
            if(connected[node][i]==1 && visited[i]==-1){
                dfs(i,connected,visited);
            }
        }

      
     

    }


}