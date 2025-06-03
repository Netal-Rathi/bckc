class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

Set<List<Integer>> ans=new HashSet<>();

List<Integer> list=new ArrayList<>();
check(nums,ans,list,0);
List<List<Integer>> fine=new ArrayList<>(ans);

return fine  ;
        
    }

    public void check(int[] nums ,Set<List<Integer>> ans ,List<Integer> list,int idx){

        if(idx==nums.length  ){
            ans.add(new ArrayList<>(list));
            return;
        }
// include 
        list.add(nums[idx]);
        check(nums,ans,list,idx+1);
        list.remove(list.size()-1);

        //exclude
        check(nums,ans,list,idx+1);


        
    }
}