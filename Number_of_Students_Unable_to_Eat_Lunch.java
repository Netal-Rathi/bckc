import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> stud = new ArrayList<>(Arrays.asList(Arrays.stream(students).boxed().toArray(Integer[]::new)));
        ArrayList<Integer> sand = new ArrayList<>(Arrays.asList(Arrays.stream(sandwiches).boxed().toArray(Integer[]::new)));

        int count = 0;
        while (count < stud.size()) {
            if (stud.get(0).equals(sand.get(0))) {
                stud.remove(0);
                sand.remove(0);
                count = 0; // Reset count to 0 if a student gets a sandwich
            } else {
                int first = stud.remove(0);
                stud.add(first); // Move student to the end of the queue
                count++; // Increment count if a student can't get a sandwich
            }
        }
        return stud.size();
    }
}

// Title: Number of Students Unable to Eat Lunch
