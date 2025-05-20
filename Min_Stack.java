class MinStack {
    private List<int[]> list;
 
    public MinStack() {
        list=new ArrayList<>();
 
        
    }
    
    public void push(int val) {
   int [] top= list.isEmpty() ? new int []{val,val} : list.get(list.size()-1);
   int minval=top[1];
   if(minval>val){
    minval=val;
   }
   list.add(new int [] {val,minval});

        
    }
    
    public void pop() {
       list.remove(list.size()-1);
    }
    
    public int top() {
        if(list.isEmpty()){
            return-1;
        }
        return list.get(list.size()-1)[0];

        
    }
    
    public int getMin() {
        if(list.isEmpty()){
            return -1;
        }
     return list.get(list.size()-1)[1];
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