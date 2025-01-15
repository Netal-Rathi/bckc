import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1 || s.length()==0){
            return false;
        }
        Stack <Character> stack=new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch.equals('(') || ch.equals('{') || ch.equals('[')){
                stack.push(ch);
            }else if(ch.equals(')') && !stack.isEmpty() && stack.peek().equals('(') ){
                stack.pop();
            }else if(ch.equals(']') && !stack.isEmpty() && stack.peek().equals('[') ){
                stack.pop();
            }else if(ch.equals('}') && !stack.isEmpty() && stack.peek().equals('{') ){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
// Title: Valid Parentheses
