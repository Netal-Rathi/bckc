import java.util.Stack;
class Solution {
    public String removeOuterParentheses(String s) {
    //   Stack <Character> s1=new Stack<>();
    //   String ans="";
    //   for(int i=0;i<s.length();i++){
    //     Character ch=s.charAt(i);
    //     if (ch=='('){
    //         if(!s1.isEmpty()){
    //             ans=ans+ch;
    //         }
    //         s1.push(ch);
    //     }
    //   else{
    //     s1.pop();
    //     if(!s1.isEmpty()){
    //         ans+=ch;
    //     }
    //   }
    //   }

    StringBuilder s1=new StringBuilder();
    int depth=0;

    for(int i=0;i<s.length();i++){
        Character ch=s.charAt(i);
        if(ch=='('){
            if(depth>0){
                s1.append(ch);
            }
            depth++;
        }else{
            depth--;
            if(depth>0){
                s1.append(ch);
            }
            //depth--;
        }

    }
      return s1.toString();
    }
}