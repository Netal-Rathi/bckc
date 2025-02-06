import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) {
            return ans;
        }
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if (numRows == 1) {
            return ans;
        }
        return helper(numRows,  ans ,1);

    }

    public List<List<Integer>> helper(int numRows, List<List<Integer>> ans , int n) {
        if (n == numRows) {
            return ans;
        }

        List<Integer> previous = ans.get(n - 1);
        List<Integer> current = new ArrayList<>();

        current.add(1);
        for (int i = 1; i < previous.size(); i++) {
            current.add(previous.get(i) + previous.get(i - 1));
        }
        current.add(1);
        ans.add(current);
        return helper(numRows,  ans, n+1);
    }
}