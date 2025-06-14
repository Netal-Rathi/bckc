class Solution {
    public String generateTag(String caption) {
        String[] words = caption.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            
            StringBuilder cleaned = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    cleaned.append(ch);
                }
            }

            if (cleaned.length() == 0) continue;

           
            if (i == 0) {
                sb.append(cleaned.toString().toLowerCase());
            } else {
                sb.append(Character.toUpperCase(cleaned.charAt(0)));
                if (cleaned.length() > 1) {
                    sb.append(cleaned.substring(1).toLowerCase());
                }
            }

            
            if (sb.length() >= 100) {
                return sb.substring(0, 100);
            }
        }

        return sb.toString();
    }
}
