class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //no cycle for answer 
        int [] indegree=new int[numCourses];
        int k=0;
        int count=0;
        int [] ans=new int[numCourses];
        int [] visited=new int[numCourses];
        Arrays.fill(visited,-1);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }

            for(int [] arr : prerequisites ){
                list.get(arr[1]).add(arr[0]);
                indegree[arr[0]]++;
            }
        Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<numCourses;i++){
              //  indegree[i]=list.get(i).size();
                if(indegree[i]==0){
                    q.offer(i);
                    count++;
                    visited[i]=1;
                    //ans.add[i];
                    ans[k]=i;
                    k++;
                }
            }
        if(q.isEmpty()){
            return new int[0];
        }
            while(!q.isEmpty()){
                int i=q.poll();
              //  visited[i]=1;
                ArrayList<Integer> li=list.get(i);
                for(int j: li){
                    if(visited[j]==-1){
                    indegree[j]--;
                    if(indegree[j]==0){
                        q.add(j);
                        ans[k]=j;
                        k++;
                        visited[j]=1;
                        count++;
                    }
                    }
                }

            
            }
            return count==numCourses ? ans : new int[0];
        
    }
}