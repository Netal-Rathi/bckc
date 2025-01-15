class Solution {
    public boolean isValid(String s) {
        Stack stack=new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch.equals('(') || ch.equals('{') || ch.equals('[')){
                stack.push(ch);
            }else if(ch.equals(')') && stack.peek().equals('(') && !stack.isEmpty()){
                stack.pop();
            }else if(ch.equals(']') && stack.peek().equals('[') && !stack.isEmpty()){
                stack.pop();
            }else if(ch.equals('}') && stack.peek().equals('{') && !stack.isEmpty()){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}