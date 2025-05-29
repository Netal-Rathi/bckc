class StockSpanner {
    // HashMap<Integer,Integer> map=new HashMap<>();
    // Stack<Integer> stack=new Stack<>();
    Stack<int[]> stack;


    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
           // count++;
            // if(map.containsKey(stack.peek())){
            //     count+=map.get(stack.peek());
            // }
           // map.put(stack.peek(),count);
            count+=stack.pop()[1];
        }
        stack.push(new int []{price,count});
        // map.put(price,count);
        return count;
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */