class Solution {
    public int lengthAfterTransformations(String s, int t) {
        // 97 -122 
        int n=s.length();
        if(t==0){
            return n;
        }
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==122){
            n+=1;
        }else if(s.charAt(i)>=(122-(t-1))){
            n+=1;
            System.out.println(n);
       }else{
        continue ;
       }
       }
           // return n % (Math.pow(10,9)+7);
           return n;
    }
}