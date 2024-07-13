import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> positions[a] - positions[b]);

        List<Integer> stack = new ArrayList<>();
        for (int i : indices) {
            while (!stack.isEmpty() && directions.charAt(stack.get(stack.size() - 1)) == 'R' && directions.charAt(i) == 'L') {
                int j = stack.get(stack.size() - 1);
                if (healths[j] == healths[i]) {
                    healths[j] = 0;
                    healths[i] = 0;
                    stack.remove(stack.size() - 1);
                    break;
                } else if (healths[j] > healths[i]) {
                    healths[j] -= 1;
                    healths[i] = 0;
                    break;
                } else {
                    healths[i] -= 1;
                    healths[j] = 0;
                    stack.remove(stack.size() - 1);
                }
            }
            if (healths[i] > 0) {
                stack.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                result.add(healths[i]);
            }
        }
        return result;
    }

    public static boolean issame(String directions) {
        for (int i = 1; i < directions.length(); i++) {
            if (directions.charAt(0) != directions.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
