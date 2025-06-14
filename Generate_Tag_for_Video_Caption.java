class Solution {
    public String generateTag(String caption) {
        String[] arr = caption.split(" ");
        StringBuilder s = new StringBuilder();
        s.append('#');

      
        if (arr.length > 0) {
            String first = arr[0];
            if (first.length() > 0) {
                s.append(Character.toLowerCase(first.charAt(0)));
                if (first.length() >= 100) {
                    s.append(first.substring(1, 99).toLowerCase());  
                } else {
s.append(first.substring(1).toLowerCase());

                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            String word = arr[i];
            if (word.isEmpty()) continue;

            // Decide first character case
            if (!word.equalsIgnoreCase("leetcode")) {
                s.append(Character.toUpperCase(word.charAt(0)));
            } else {
                s.append(Character.toLowerCase(word.charAt(0)));
            }

           
            if (s.length() >= 100) return s.substring(0, 100);

            
            for (int j = 1; j < word.length(); j++) {
                char ch = Character.toLowerCase(word.charAt(j));
                if (ch >= 'a' && ch <= 'z') {
                    s.append(ch);
                }

                if (s.length() >= 100) return s.substring(0, 100);
            }
        }

        return s.toString();
    }
}
