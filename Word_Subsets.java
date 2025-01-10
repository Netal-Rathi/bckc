class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();

      int  maxcount []=new int[26];
        for(String check:words2){
           int count[]=new int [26];
                for(char c:check.toCharArray()){
                    count[c-'a']++;
                }

            for(int i=0;i<26;i++){
                maxcount[i]=Math.max(maxcount[i],count[i]);
            }

        }
        search : for(String word: words1){
          int  maincheck[]=new int[26];
            for(char c: word.toCharArray()){
                maincheck[c-'a']++;
            }
            for(int i=0;i<26;i++){
                if(maincheck[i]<maxcount[i]){
                     continue search;
                     
                }
               
            }
             ans.add(word);
            
        }
return ans;
    }
}
// Title: Word Subsets
