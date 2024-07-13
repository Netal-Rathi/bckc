import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int[] health = healths.clone();  // Clone to avoid modifying the original healths array

        // Iterate through the robots and handle collisions
        for (int i = 0; i < positions.length - 1; i++) {
            if (directions.charAt(i) == 'R' && directions.charAt(i + 1) == 'L') {
                if (health[i] == health[i + 1]) {
                    health[i] = 0;
                    health[i + 1] = 0;
                } else if (health[i] > health[i + 1]) {
                    health[i] -= health[i + 1];
                    health[i + 1] = 0;
                } else {
                    health[i + 1] -= health[i];
                    health[i] = 0;
                }
                i++; // Skip the next robot since it has already been processed
            }
        }

        // Collect the healths of the robots that have survived
        List<Integer> finalans = new ArrayList<>();
        for (int i = 0; i < health.length; i++) {
            if (health[i] > 0) {
                finalans.add(health[i]);
            }
        }

        return finalans;
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
