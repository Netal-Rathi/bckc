class Solution {
    public boolean rotateString(String s, String goal) {
        // Find all positions where the first character of goal occurs in s
        int[] arr = position(s, goal.charAt(0));
        
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            boolean isMatch = true;

            // Compare characters circularly
            for (int j = 0; j < goal.length(); j++) {
                int sIndex = (start + j) % s.length(); // Circular index in s
                if (goal.charAt(j) != s.charAt(sIndex)) {
                    isMatch = false;
                    break;
                }
            }

            // If a match is found, return true
            if (isMatch) {
                return true;
            }
        }

        // If no match found, return false
        return false;
    }

    public int[] position(String s, Character cg) {
        int[] arr = new int[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == cg) {
                arr[j] = i;
                j++;
            }
        }
        return Arrays.copyOf(arr, j); // Return only the valid positions
    }
}

// Title: Rotate String
