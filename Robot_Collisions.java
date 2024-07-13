import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int[] health = healths;

        // Moved the static method outside the method and inside the class
        if (issame(directions)) {
            return Arrays.asList(Arrays.stream(health).boxed().toArray(Integer[]::new));
        } else {
            for (int i = 0; i < positions.length - 1; i++) {
                if (directions.charAt(i) != directions.charAt(i + 1)) {
                    // Original commented out logic
                    // if(positions[i]<positions[i+1] && directions.charAt(i)!='R'  && directions.charAt(i+1)!='L'){
                    // continue;
            
                 //   }else if(position[i]>position[j] && directions.charAt(i)='R'){


                    if(positions[i]<positions[i+1]){

                     if (healths[i] == healths[i + 1]) {
                        healths[i] = 0;
                        healths[i + 1] = 0;
                    } else if (healths[i] > healths[i + 1]) {
                        healths[i + 1] = 0;
                        healths[i] = healths[i] - 1;
                    } else {
                        healths[i] = 0;
                        healths[i + 1] = healths[i + 1] - 1;
                    }
                    i++;
                }else if((directions.charAt(i)!='L' && directions.charAt(i+1)!='R') || (directions.charAt(i)!='R' && directions.charAt(i+1)!='L')){

                    if (healths[i] == healths[i + 1]) {
                        healths[i] = 0;
                        healths[i + 1] = 0;
                    } else if (healths[i] > healths[i + 1]) {
                        healths[i + 1] = 0;
                        healths[i] = healths[i] - 1;
                    } else {
                        healths[i] = 0;
                        healths[i + 1] = healths[i + 1] - 1;
                    }
                    i++;

                }


                
                }
            }

            List<Integer> finalans = new ArrayList<>();
            for (int i = 0; i < healths.length; i++) {
                if (healths[i] != 0) {
                    finalans.add(healths[i]);
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
