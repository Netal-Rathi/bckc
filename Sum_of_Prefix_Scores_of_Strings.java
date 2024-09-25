class Solution {
    public int[] sumPrefixScores(String[] words) {
        int[] arr = new int[words.length]; // Correctly declare the array
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String str = ""; // Initialize str for each word

            // Loop through each character in the current word
            for (int k = 0; k < words[i].length(); k++) {
                str += words[i].charAt(k); // Build the prefix
                
                // Check all words to see if they start with the current prefix
                for (int m = 0; m < words.length; m++) {
                    if (words[m].startsWith(str)) {
                        count++; // Increment count if a word starts with the prefix
                    }
                }
            }
            arr[i] = count; // Store the count in the result array
        }
        return arr; // Return the result array
    }
}
