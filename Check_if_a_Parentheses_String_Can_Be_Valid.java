import java.util.Stack;
class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2==1){
            return false;
        }
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> open=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                stack1.push(i);
            }else if(s.charAt(i)=='('){
                open.push(i);
            }else if(s.charAt(i)==')' ){
                if(!open.isEmpty()){
                open.pop();
                }else if(!stack1.isEmpty()){
                    stack1.pop();
                }else{
                    return false;
                }
    }
 
}

while(!open.isEmpty() && !stack1.isEmpty() && open.peek()<stack1.peek()){
    open.pop();
    stack1.pop();
}

if(!open.isEmpty()){
    return false;

}
if(stack1.size()%2!=0){
    return false;
}
    return true;
}
}