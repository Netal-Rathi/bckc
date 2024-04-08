import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> stud = new ArrayList<>();
        ArrayList<Integer> sand = new ArrayList<>();

        
        for (int s : students) {
            stud.add(s);
        }
        for (int s : sandwiches) {
            sand.add(s);
        }

        int count = 0;
        while (count < stud.size()) {
            if (stud.get(0) == sand.get(0)) { 
                stud.remove(0);
                sand.remove(0);
                count = 0; 
            } else {
                int first = stud.remove(0);
                stud.add(first); 
                count++; 
            }
        }
        return stud.size();
    }
}

// Title: Number of Students Unable to Eat Lunch
