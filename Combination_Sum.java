class Solution {
    int idx;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        calculate(candidates,target,0,0,list,ans);
        return ans;
        
    }

    public void calculate (int[] candidates,int target,int idx,int sum,List<Integer>list,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            
            return;
        }else if(sum>target){
           // list.remove(candidates[idx]);
            //idx++;
            return ;
        }
        
        if(idx==candidates.length){
            return ;
        }
    
        for(int i=idx;i<candidates.length;i++){
               
        list.add(candidates[i]);
       calculate(candidates,target,i,sum+candidates[i],list,ans);
      list.remove(list.size()-1);

        }
       

    }
}
// Title: Combination Sum
