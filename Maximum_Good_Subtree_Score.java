import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    List<List<Integer>> tree;
    int[] vals;
    int n;

    public int goodSubtreeSum(int[] vals, int[] par) {
        this.vals = vals;
        this.n = vals.length;

        tree = new ArrayList<>();
        for (int i = 0; i < n; i++) tree.add(new ArrayList<>());
        for (int i = 1; i < n; i++) {
            tree.get(par[i]).add(i);
        }

        int[] maxScore = new int[n];
        dfs(0, maxScore);

        long ans = 0;
        for (int v : maxScore) {
            ans = (ans + v) % MOD;
        }
        return (int) ans;
    }

    private Map<Integer, Integer> dfs(int u, int[] maxScore) {
        Map<Integer, Integer> dp = new HashMap<>();
        int mask = getDigitMask(vals[u]);
        if (mask == -1) {
            dp.put(0, 0); // can't pick this node, empty subset only
        } else {
            dp.put(0, 0);
            dp.put(mask, vals[u]);
        }

        for (int c : tree.get(u)) {
            Map<Integer, Integer> childDP = dfs(c, maxScore);
            dp = merge(dp, childDP);
        }

        int best = 0;
        for (int v : dp.values()) {
            if (v > best) best = v;
        }
        maxScore[u] = best;
        return dp;
    }

    private Map<Integer, Integer> merge(Map<Integer, Integer> dp1, Map<Integer, Integer> dp2) {
        Map<Integer, Integer> merged = new HashMap<>(dp1);

        for (Map.Entry<Integer, Integer> e1 : dp1.entrySet()) {
            int mask1 = e1.getKey();
            int sum1 = e1.getValue();

            for (Map.Entry<Integer, Integer> e2 : dp2.entrySet()) {
                int mask2 = e2.getKey();
                int sum2 = e2.getValue();

                if ((mask1 & mask2) == 0) {
                    int combinedMask = mask1 | mask2;
                    int combinedSum = sum1 + sum2;
                    merged.put(combinedMask, Math.max(merged.getOrDefault(combinedMask, 0), combinedSum));
                }
            }
        }

        return merged;
    }

    private int getDigitMask(int val) {
        int mask = 0;
        while (val > 0) {
            int d = val % 10;
            if ((mask & (1 << d)) != 0) return -1;
            mask |= (1 << d);
            val /= 10;
        }
        return mask;
    }
}
