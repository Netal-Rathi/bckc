import java.util.Arrays;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        return helper(nums, "", 0);
    }
    
    private String helper(String[] nums, String ans, int n) {
        // Base case: If the length of 'ans' is equal to nums.length
        if (n == nums.length) {
            if (!Arrays.asList(nums).contains(ans)) {
                return ans;
            }
            return null;
        }

        // Explore both possibilities: '0' and '1' at the current position
        String result = helper(nums, ans + '0', n + 1);
        if (result != null) return result; // Return if a valid string is found
        
        result = helper(nums, ans + '1', n + 1);
        return result;
    }
}
