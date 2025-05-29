import java.util.*;

class LRUCache {
 int capacity;
 Deque <Integer> q;
 Map<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.q=new ArrayDeque<>();
        this.map=new HashMap<>();

    }
    
    public int get(int key) {

        if(!map.containsKey(key)){
            return -1;
        }
        q.remove(key);
        q.addLast(key);
        return map.get(key);
  
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);

        }else if(q.size()==capacity){
           int lru = q.pollFirst(); // Remove LRU key
            map.remove(lru);
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
// Title: LRU Cache
