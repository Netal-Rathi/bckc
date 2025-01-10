class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int ans[] = position(s, goal.charAt(0));
       // int i = 0;
        for (int j = 0; j < ans.length; j++) {
            int start = ans[j];
            boolean isvalid=true;
            for (int k = 0; k < goal.length(); k++) {

                int idx = (start + k) % s.length();
                if (goal.charAt(k) != s.charAt(idx)) {
                    // continue;
                    isvalid = false;
                    break;
                }

            }
            if (isvalid) {
                return true;
                // break;
            } 
        }
        return false;

    }

    public int[] position(String s, Character cg) {
        int arr[] = new int[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(cg)) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
        //return Arrays.copyOf(arr, j);
    }
}
// Title: Rotate String
