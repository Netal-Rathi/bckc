import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate elements

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate `left` elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate `right` elements
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Move towards larger numbers
                } else {
                    right--; // Move towards smaller numbers
                }
            }
        }
        return ans;
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
