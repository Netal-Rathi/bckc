
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        int n = nums.length;
        if (n < 3) {
            return new ArrayList<>(ans);
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++)

                    if (i != j && i != k && j != k
                            && nums[i] + nums[j] + nums[k] == 0) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));

                    }
            }
        }
        return new ArrayList<>( ans);
    }
}

// class Solution {
// public List<List<Integer>> threeSum(int[] nums) {
// Set<List<Integer>> ans =new HashSet<>();
// List<Integer> list=new ArrayList<>();
// if (nums.length < 3) {
// return new ArrayList<>(ans);
// }
// Arrays.sort(nums);
// helper(nums,list,0,ans);
// return new ArrayList<>(ans);
// }

// public void helper(int [] nums,List<Integer> list,int n,Set<List<Integer>>
// ans){

// if(n==nums.length){
// if(list.size()==3 && (list.get(0)+list.get(1)+list.get(2))==0 &&
// !ans.contains(list)){
// ans.add(new ArrayList<>(list));

// }
// return;
// }

// helper(nums,list,n+1,ans);
// list.add(nums[n]);
// helper(nums,list,n+1,ans);
// list.remove(list.size()-1);

// }
// }

// galat logic
