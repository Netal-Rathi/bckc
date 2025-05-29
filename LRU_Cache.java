import java.util.*;

class LRUCache {
    private final int capacity;
    private final Deque<Integer> q; // stores keys in order: least recently used -> most
    private final Map<Integer, Integer> map; // key -> value

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.q = new ArrayDeque<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        // move key to the end (most recently used)
        q.remove(key);
        q.addLast(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update value and refresh usage order
            q.remove(key);
        } else if (q.size() == capacity) {
            // Remove least recently used key
            int lru = q.pollFirst();
            map.remove(lru);
        }

        // Insert key as most recently used
        q.addLast(key);
        map.put(key, value);
    }
}

// Title: LRU Cache
