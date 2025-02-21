class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < nums.length; i++) {
            // Flip the i-th character of the i-th string
            ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        
        return ans.toString();
    }
}
