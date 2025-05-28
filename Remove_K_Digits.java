class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()-1){
            return "0";
        }
        Stack <Character> stack=new Stack<>();
            int temp=k;
            for(int i=0;i<num.length();i++){
               // stack.push(num.charAt(i));
                while(!stack.isEmpty() && temp!=0 && num.charAt(i)<stack.peek()){
                    stack.pop();
                    temp--;
                }
                // if(stack.isEmpty() || num.charAt(i)<stack.peek()){
                //     stack.push(num.charAt(i));
                // }
                
                stack.push(num.charAt(i));
            }
            while(!stack.isEmpty() && temp!=0){
                stack.pop();
            }

            StringBuilder ans=new StringBuilder();
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
       String finans=   ans.reverse().toString().replaceFirst("^0+","");
       return finans.length()==0? "0" : finans;
           
    }
}
// Title: Remove K Digits
