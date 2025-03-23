class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count=0;
        Queue <Integer> q=new LinkedList<>();
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> ind=new ArrayList<>(Collections.nCopies(numCourses,0));

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }
        for(int[] edge :prerequisites ){
            adj.get(edge[1]).add(edge[0]);
            ind.set(edge[0],ind.get(edge[0])+1);
        }

        for(int i=0;i<ind.size();i++){
            if(ind.get(i)==0){
                q.add(i);
              //  count++;

            }
        }

        while(!q.isEmpty()){
            int node =q.poll();
            count++;
            for(int i :adj.get(node)){
              ind.set(i,  ind.get(i)-1);
                if(ind.get(i)==0){
                    q.offer(i);
                   // count++;
                }


            }

        }
        System.out.print(count);

        return count==numCourses ;
        
    }
}