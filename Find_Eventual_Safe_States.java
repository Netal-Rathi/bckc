class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list=new ArrayList<>();
       // List<Integer> ans=new ArrayList<>();
               int n = graph.length;
       boolean []ans=new boolean[n];
       Arrays.fill(ans,true);

        for(int i=0;i<n;i++){
            if(graph[i].length==0){
                list.add(i);
                ans[i]=false;
            }

            
        }

        for(int i=0;i<n;i++){
            if(!(Arrays.stream(graph[i]).allMatch(list::contains)) ){
                ans[i]=false;
            }
        }
        System.out.println(list);

        for(int i=0;i<n;i++){
            if(ans[i]){
                list.add(i);
            }
        }
         //ans.addAll(list);
         list.sort(Comparator.naturalOrder());
         return list;


    }
}
// Title: Find Eventual Safe States
