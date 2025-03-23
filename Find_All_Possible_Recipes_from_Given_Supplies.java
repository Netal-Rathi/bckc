class Solution {

    public List<String> findAllRecipes(
            String[] recipes,
            List<List<String>> ingredients,
            String[] supplies) {
                HashSet<String> set=new HashSet<>(Arrays.asList(supplies));
                // for(String s : supplies){
                //     set.add(s);
                // }
            HashMap<String,Integer> ind=new HashMap<>();
            HashMap<String,List<String>> adj=new HashMap<>();
            Queue<String> q=new LinkedList<>();
            List<String> ans=new ArrayList<>();

                for(int i=0;i<recipes.length;i++){
                       ind.put(recipes[i], 0); 
                   
                    for(String s : ingredients.get(i)){
                      
                        if(!set.contains(s)){


                            adj.putIfAbsent(s,new ArrayList<>());
                            adj.get(s).add(recipes[i]);
                            ind.put(recipes[i],ind.getOrDefault(recipes[i],0)+1);

                        }

                    }
                }

                for(Map.Entry<String,Integer> entry:ind.entrySet()){
                    if(entry.getValue()==0){
                    q.offer(entry.getKey());
                    }
                }

                while(!q.isEmpty()){
                    String node=q.poll();
                    ans.add(node);

                        for( String n : adj.getOrDefault(node,new ArrayList<>())){
                            ind.put(n,ind.get(n)-1);

                            if(ind.get(n)==0){
                                q.offer((n));
                            }

                        }


                }
              
                return ans;

    }
}
// Title: Find All Possible Recipes from Given Supplies
