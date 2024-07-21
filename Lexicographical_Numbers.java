import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            isLexical(n, i, ans);
        }
        return ans;
    }

    private void isLexical(int n, int num, List<Integer> ans) {
        if (num > n) {
            return;
        }
        ans.add(num);
        for (int i = 0; i <= 9; i++) {
            int next = num * 10 + i;
            if (next > n) {
                return;
            }
            isLexical(n, next, ans);
        }
    }
}

// Title: Lexicographical Numbers
