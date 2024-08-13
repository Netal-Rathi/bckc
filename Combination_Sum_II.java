class Solution {
     
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(candidates);
        Backtrack(candidates,target ,0,new ArrayList<>(),ans);
        return ans;


    }

    public void Backtrack(int[] candidates,int target,int start,List <Integer> temp,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
        }else if(target>0){
            for(int i=start;i<candidates.length;i++){
                if(i>start && candidates[i]==candidates[i-1]){
                    continue;
                }
                temp.add(candidates[i]);
                Backtrack(candidates,target-candidates[i],i+1,temp,ans);
                temp.remove(temp.size()-1);



            }
        }
    }
}
