import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        if (issame(directions)) {
            return Arrays.asList(Arrays.stream(healths).boxed().toArray(Integer[]::new));
        }

        List<Integer> survivingRobots = new ArrayList<>();
        int n = positions.length;

        for (int i = 0; i < n; i++) {
            boolean collided = false;
            for (int j = i + 1; j < n; j++) {
                if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
                    collided = true;
                    if (positions[i] < positions[j]) {
                        if (healths[i] == healths[j]) {
                            healths[i] = 0;
                            healths[j] = 0;
                        } else if (healths[i] > healths[j]) {
                            healths[i] -= 1;
                            healths[j] = 0;
                        } else {
                            healths[j] -= 1;
                            healths[i] = 0;
                        }
                    }
                    break;
                }
            }
            if (!collided || healths[i] > 0) {
                survivingRobots.add(healths[i]);
            }
        }

        return survivingRobots;
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

// Title: Robot Collisions
