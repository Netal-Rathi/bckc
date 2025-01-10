class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        // StringBuilder s1=new StringBuilder(String.join("",words1));
        // StringBuilder temp=new StringBuilder();
        String Hello = "";
        int count = 0, checkcount = 0;
        String result = String.join("",words2);

        for (String word : words1) {
            count = 0;

            // checkcount=0;
            StringBuilder temp = new StringBuilder(word);
            // temp=word;

            for (int i = 0; i < result.length(); i++) {
                // StringBuilder temp=new StringBuilder(check);

                if (temp.toString().contains(Character.toString(result.charAt(i)))) {
                    // temp.replace(Character.toString(check.charAt(i)),"");
                    temp.deleteCharAt(temp.indexOf(Character.toString(result.charAt(i))));
                    count++;
                    // checkcount++;
                } else {
                    break;
                }
            }

            if (count == result.length()) {
                ans.add(word);
            }

        }
        return ans;

    }
}
// Title: Word Subsets
