import java.util.*;

class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int maxsum = -1;
        Set<List<Integer>> set = new HashSet<>();
        generateTriplets(set, x, 0, new ArrayList<>());

        for (List<Integer> triplet : set) {
            int sum = y[triplet.get(0)] + y[triplet.get(1)] + y[triplet.get(2)];
            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }

    private void generateTriplets(Set<List<Integer>> set, int[] x, int start, List<Integer> current) {
        if (current.size() == 3) {
            int a = x[current.get(0)];
            int b = x[current.get(1)];
            int c = x[current.get(2)];

            if (a != b && b != c && a != c) {
                set.add(new ArrayList<>(current)); 
            }
            return;
        }

        for (int i = start; i < x.length; i++) {
            current.add(i);
            generateTriplets(set, x, i + 1, current);
            current.remove(current.size() - 1); 
        }
    }
}

// Title: Maximize Y‑Sum by Picking a Triplet of Distinct X‑Values
