class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        StringBuilder s1=new StringBuilder(String.join("",words1));
        String temp,Hello="";
        int count=0,checkcount=0;


        for(String word : words1){
            count=0;
            for(String check: words2){
                checkcount=0;
                temp=word;
                
                for(int i=0;i<check.length();i++){
                 //   StringBuilder temp=new StringBuilder(check);
                
                if(word.contains(Character.toString(check.charAt(i)))){
                    temp.replace(Character.toString(check.charAt(i)),"");
                    checkcount++;
                }else{
                    break;
                }
                }
                if(checkcount==check.length()){
                count++;
                }
                 
            }
            if(count==words2.length){
                ans.add(word);
                   }
           
        }
        return ans;

    }
}