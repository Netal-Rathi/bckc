class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }
        Stack <Character> stack=new Stack<>();
            int temp=k;
            for(int i=0;i<num.length();i++){
               // stack.push(num.charAt(i));
                while(!stack.isEmpty() && temp>0 && num.charAt(i)<stack.peek()){
                    stack.pop();
                    temp--;
                }
                
               stack.push(num.charAt(i));
            }
            while(!stack.isEmpty() && temp!=0){
                stack.pop();
                temp--;
            }

              StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        // remove leading '0's
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }
        String res = sb.substring(idx);
        return res.isEmpty() ? "0" : res;
           
    }
}
// Title: Remove K Digits
