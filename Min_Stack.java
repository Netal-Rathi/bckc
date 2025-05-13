class MinStack {
    private Stack<Integer> stack;
        private Stack<Integer> stack1;
    public MinStack() {
        stack=new Stack<>();
         stack1=new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()){
            return-1;
        }
        return stack.peek();

        
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        int mincal=Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            mincal=Math.min(mincal,top());
            stack1.push(stack.pop());
        }
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
        return mincal;
    }
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */