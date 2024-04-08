import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       ArrayList stud=new ArrayList<>();
       ArrayList sand =new ArrayList<>();

       for(int s : students){
        stud.add(s);
       }
       for (int s : sandwiches){
        sand.add(s);
       }

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
