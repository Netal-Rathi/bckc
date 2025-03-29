class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, List<Integer>> map = new HashMap<>();

        // Populate the map with character indices
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), new ArrayList<>());  // Ensure the key exists
            map.get(s.charAt(i)).add(i);  // Add index to the list
        }

        int i = 0;
        while (i < s.length()) {  // Loop condition corrected
            HashSet<Character> set = new HashSet<>();
            int start = map.get(s.charAt(i)).get(0);
            int end = map.get(s.charAt(i)).get(map.get(s.charAt(i)).size() - 1);

            for (int j = start; j <= end; j++) {
                set.add(s.charAt(j));

                // Fixing incorrect parentheses and index out-of-bounds
                int lastIndex = map.get(s.charAt(j)).get(map.get(s.charAt(j)).size() - 1);
                if (lastIndex > end) {
                    end = lastIndex;
                }
            }

            ans.add(end - start + 1);
            i = end + 1;  // Move i to the next partition
        }
        return ans;
    }
}

// Title: Partition Labels
