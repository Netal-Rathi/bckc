class StockSpanner {
    HashMap<Integer,Integer> map=new HashMap<>();
    Stack<Integer> stack=new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=0;
        while(!stack.isEmpty() && stack.peek()<=price){
            count++;
            if(map.containsKey(stack.peek())){
                count+=map.get(stack.peek());
            }
           // map.put(stack.peek(),count);
            stack.pop();
        }
        stack.push(price);
        map.put(price,count);
        return count+1;
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
// Title: Online Stock Span
