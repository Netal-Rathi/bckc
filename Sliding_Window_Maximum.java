class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
             Deque <Integer> q=new ArrayDeque<>();
              ArrayList <Integer> ans=new ArrayList<>();
              int n=nums.length;
             

              for(int i=0;i<n;i++){
                while(!q.isEmpty() && q.peekFirst()<=i-k){
                    q.removeFirst();
                }


                while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                    q.removeLast();
                }
                q.addLast(i);
                if(i>=k-1){
                    ans.add(nums[q.peekFirst()]);
                }
              }

            return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
// Title: Sliding Window Maximum
