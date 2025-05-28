class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        
        Deque<Integer> q = new ArrayDeque<>();  // will store indices, and nums[q.peekFirst()] is current window max
        int[] res = new int[n - k + 1];
        
        for (int i = 0; i < n; i++) {
            // 1) Remove indices that are out of this window
            while (!q.isEmpty() && q.peekFirst() <= i - k) {
                q.removeFirst();
            }
            
            // 2) Pop smaller elements in deque in O(1) time
            //    so that the largest element’s index is always at the front
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.removeLast();
            }
            
            // 3) Add current element’s index to the back
            q.addLast(i);
            
            // 4) Starting from i = k-1, record the max for each window
            if (i >= k - 1) {
                res[i - k + 1] = nums[q.peekFirst()];
            }
        }
        
        return res;
    }
}
