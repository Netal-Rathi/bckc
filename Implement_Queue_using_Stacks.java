class MyQueue {
    private Stack<Integer> stack ;
    private Stack <Integer> stack2;

    public MyQueue() {
        stack=new Stack<>();
        stack2=new Stack<>();
        
    }
    
    public void push(int x) {
        stack.push(x);
       
    }
    
    public int pop() {
        int top=0;
        if(empty()){
            return -1;
            
        }else{
            while(!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            top=stack2.pop();
            while(!stack2.isEmpty()){
                stack.push(stack2.pop());
            }
          
            
            
        }
        return top;
        
    }
    
    public int peek() {
       // return stack.peek();
       int top=0;
       while(!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            top=stack2.peek();
            while(!stack2.isEmpty()){
                stack.push(stack2.pop());
            }
          return top;
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */