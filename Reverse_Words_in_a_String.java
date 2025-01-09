class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int from = s.length();
        int j = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            // If we encounter a space or the beginning of the string
            if (s.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    // When we are at the start of the string
                    for (int k = i; k < j; k++) {
                        ans.append(s.charAt(k));
                    }
                } else {
                    from = i + 1;
                    // Append the word between 'from' and 'j'
                    for (int k = from; k < j; k++) {
                        ans.append(s.charAt(k));
                    }
                    ans.append(' '); // Add space between words
                }
                j = i; // Update the end of the word
            }
        }
        
        // Replace multiple spaces with a single space
        String result = ans.toString().trim().replaceAll("\\s{2,}", " ");
        
        return result; // Return the final result without leading/trailing spaces
    }
}

// Title: Reverse Words in a String
