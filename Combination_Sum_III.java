class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        check(k,n,0,ans,1,list);
        return ans;
        
    }

    public void check(int k ,int n,int sum ,List<List<Integer>> ans ,int i,List<Integer> list){
                    // if(i>9){
                    //     return;
                    // }
        if( i==9 ){
            if(list.size()==k && sum==n){
           // if(sum==n){
                ans.add(new ArrayList<>(list));
                 
            }
             return ;   
        }
          

            list.add(i);
            sum+=i;
            check(k,n,sum,ans,i+1,list);
            sum-=list.get(list.size()-1);
            list.remove(list.size()-1);

            check(k,n,sum,ans,i+1,list);



        }


    }

// Title: Combination Sum III
