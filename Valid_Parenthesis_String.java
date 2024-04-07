import java.util.*;
class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        Stack <Integer> left=new Stack<>();
       // Stack <String> right=new Stack<>();
        Stack <Integer> any=new Stack<>();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
                
            if(c=='('){
                left.push(i);
            }
            else if(c=='*'){
                any.push(i);
            }else//c==)
            {
                if(!left.isEmpty()){
                    left.pop();
                }else if(!any.isEmpty()){
                    any.pop();
                }else{
                    return false;
                }

            }
        }
        while (!left.isEmpty() && !any.isEmpty()){
            if(left.pop()>any.pop()){
                return false;
            }
        }
        return left.isEmpty();
        
        
    }
}