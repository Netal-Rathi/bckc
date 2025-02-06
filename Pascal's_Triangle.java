import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        
        // First row is always [1]
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if (numRows == 1) {
            return ans;
        }
        
        return helper(numRows, 1, ans);
    }

    public List<List<Integer>> helper(int numRows, int n, List<List<Integer>> ans) {
        if (n == numRows) {
            return ans;
        }
        
        List<Integer> prevRow = ans.get(n - 1);
        List<Integer> currRow = new ArrayList<>();
        
        // First element is always 1
        currRow.add(1);
        
        // Generate middle elements
        for (int i = 1; i < prevRow.size(); i++) {
            currRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        
        // Last element is always 1
        currRow.add(1);
        
        ans.add(currRow);
        
        return helper(numRows, n + 1, ans);
    }
}

// Title: Pascal's Triangle
