class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        check(k,n,0,ans,1,list);
        return ans;
        
    }

    public void check(int k ,int n,int sum ,List<List<Integer>> ans ,int i,List<Integer> list){

                if(sum>n|| list.size()>k){
                    return;
                }  

                if(sum==n && list.size()==k){
                    ans.add(new ArrayList<>(list));
                    return ;
                }

                  for(int j=i;j<=9;j++){
                    list.add(j);
                    check(k,n,sum+j,ans,j+1,list);
                   // sum-=list.get(list.size()-1);
                    list.remove(list.size()-1);
                  }



        }


    }

// Title: Combination Sum III
