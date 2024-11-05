import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        
        for (String query : queries) {
            int j = 0; // Pointer for pattern
            boolean isMatch = true;
            
            for (int k = 0; k < query.length(); k++) {
                char queryChar = query.charAt(k);
                
                if (j < pattern.length() && queryChar == pattern.charAt(j)) {
                    j++;
                } else if (Character.isUpperCase(queryChar)) {
                    isMatch = false;
                    break;
                }
                
                if (k == query.length() - 1) {
                    if (j != pattern.length()) {
                        isMatch = false;
                    }
                }
            }
            
            ans.add(isMatch);
        }
        
        return ans;
    }
}

// Title: Camelcase Matching
