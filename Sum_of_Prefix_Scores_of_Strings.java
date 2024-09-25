class Solution {
    public int[] sumPrefixScores(String[] words) {
        int[] arr = new int[words.length]; 
        
        
        for (int i = 0; i < words.length; i++) {
            int count = 0; 
            String str = "";
            
           
            for (int k = 0; k < words[i].length(); k++) {
                str += words[i].charAt(k); 
                
               
                for (int m = 0; m < words.length; m++) {
                    if (words[m].startsWith(str)) {
                        count++; 
                    }
                }
            }
            arr[i] = count; 
        }
        return arr; 
    }
}
