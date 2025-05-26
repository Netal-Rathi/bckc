class Solution {
    public int sumSubarrayMins(int[] arr) {
      int mod = (int) 1e9 + 7;
        int n=arr.length;
        int [] left =new int[n];
        int [] right =new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
            Deque<Integer> stack = new ArrayDeque<>();
        //for(int i=0;i<n;i++){
            for(int i=0;i<n;i++){
              //  int top=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                left[i]=stack.peek();
            }
            stack.push(i);
            }
            stack.clear();

            // right previous next smaller element 

            for(int i=n-1;i>=0;i--){
              //  int top=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                right[i]=stack.peek();
            }
            stack.push(i);
            }
        
                    // previous==> i-left[i]
                    //next ==> right[i]-i
                    long answer=0;
                    for (int i = 0; i < n; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }
                return (int)answer;
    }
}
// Title: Sum of Subarray Minimums
