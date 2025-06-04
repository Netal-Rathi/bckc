class Solution {
    public List<String> letterCombinations(String digits) {
         List<String > ans=new ArrayList<>();
        if(digits.length()==0){
            return  ans;
        }
        
        HashMap <Character,String> map=new HashMap<>();
        
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");

        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");

        map.put('8',"tuv");
        map.put('9',"wxyz");
      //  map.put(4,"ghi");
      //List<String > ans=new ArrayList<>();
      StringBuilder sb=new StringBuilder();
      check(digits,map,0,ans,sb);
      return ans;
    }

    public void check(String digits,HashMap<Character,String> map,int no ,List<String> ans ,StringBuilder sb){
        if(no==digits.length()){
            ans.add(new StringBuilder(sb).toString());
            return;

        }

            char ch=digits.charAt(no);
            String s=map.get(ch);
        if(s!=null){
        for(int i=0;i<s.length();i++){
         //  StringBuilder sb=new StringBuilder();
         char c =s.charAt(i);
           // char c=map.get(digits.charAt(no)).charAt(i);
            check(digits,map,no+1,ans,sb.append(c));
            sb.deleteCharAt(sb.length()-1);
        }
        }

    }
}
// Title: Letter Combinations of a Phone Number
