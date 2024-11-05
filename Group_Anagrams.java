import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>(); // Use Map interface for better abstraction

        for (String str : strs) {
            char[] charArray = str.toCharArray(); // Convert string to char array
            Arrays.sort(charArray); // Sort the characters to form the key
            String sortedStr = new String(charArray); // Create a sorted string

            // Initialize the list if the key does not exist
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>()); // Use putIfAbsent for cleaner code
            anagramMap.get(sortedStr).add(str); // Add the original string to the corresponding list
        }

        return new ArrayList<>(anagramMap.values()); // Return the grouped anagrams as a list of lists
    }
}

// Title: Group Anagrams
