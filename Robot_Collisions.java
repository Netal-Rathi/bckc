import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        if (issame(directions)) {
            return Arrays.asList(Arrays.stream(healths).boxed().toArray(Integer[]::new));
        } else {
            for (int i = 0; i < positions.length - 1; i++) {
                if ((positions[i] < positions[i + 1] && directions.charAt(i) == 'R' && directions.charAt(i + 1) == 'L') ||
                    (positions[i] > positions[i + 1] && directions.charAt(i) == 'L' && directions.charAt(i + 1) == 'R')) {

                    if (healths[i] == healths[i + 1]) {
                        healths[i] = 0;
                        healths[i + 1] = 0;
                    } else if (healths[i] > healths[i + 1]) {
                        healths[i + 1] = 0;
                        healths[i] -= 1;
                    } else {
                        healths[i] = 0;
                        healths[i + 1] -= 1;
                    }
                    i++;
                }
            }

            List<Integer> finalans = new ArrayList<>();
            for (int health : healths) {
                if (health != 0) {
                    finalans.add(health);
                }
            }
            return finalans;
        }
    }

    // Static helper method moved outside
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
