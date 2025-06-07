import java.util.*;

class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            map.putIfAbsent(x[i], new PriorityQueue<>(Collections.reverseOrder()));
            map.get(x[i]).offer(y[i]);
        }

       
        List<Integer> topY = new ArrayList<>();
        for (PriorityQueue<Integer> pq : map.values()) {
            topY.add(pq.peek());  
        }

     
        if (topY.size() < 3) return -1; 

        Collections.sort(topY, Collections.reverseOrder());
        return topY.get(0) + topY.get(1) + topY.get(2);
    }
}
