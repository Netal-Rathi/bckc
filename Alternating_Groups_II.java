class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) { 
            boolean alternate = true;
            
            for (int j = 0; j < k - 1; j++) { 
                int first = (i + j) % n;     
                int second = (i + j + 1) % n; 
                
                if (colors[first] == colors[second]) { 
                    alternate = false;
                    break;
                }
            }
            
            if (alternate) {
                count++;
            }
        }
        return count;
    }
}

// Title: Alternating Groups II
