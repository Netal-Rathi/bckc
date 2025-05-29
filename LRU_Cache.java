class LRUCache {
    private final int capacity;
  private final Deque <Integer> q;
  private final Map<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        q=new ArrayDeque<>();
        map=new HashMap<>();
        
    }
    
    public int get(int key) {
    if(!q.contains(key)){
        return -1;
    }

        q.remove(key);
        q.addLast(key);
        return map.get(key);
        
    }
    
    public void put(int key, int value) {
      if(q.contains(key)){
        q.remove(key);
      }else{
        if(q.size()==capacity){
           // q.removeFirst();
           int lru=q.pollFirst();
           map.remove(lru);
        }

      }
      q.addLast(key);
      map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */