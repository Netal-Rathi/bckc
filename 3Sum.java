import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array
       // int sum = 0;

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
                int j = i + 1, k = n - 1;
                while (j < k) {
                  int  sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));

                        while (j<k &&nums[j] == nums[j + 1]) {
                            j++;
                        }
                        
                        while (j<k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;
                        k--;
                    } else if (sum <0) {
                       while (j<k &&nums[j] == nums[j + 1]) {
                            j++;
                        }
                        j++;

                    } else {
                         while (j<k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        k--;

                    }

                }
            
        }

        return ans;
    }

}

// Title: 3Sum
