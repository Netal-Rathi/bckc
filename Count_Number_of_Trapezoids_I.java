class Solution {
    int mod = 1000000007;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        
        for (int[] arr : points) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        // Process frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int s = entry.getValue();

            if (s == 2) {
                list.add(1);
            } else if (s > 2) {
                list.add((int)((1L * s * (s - 1) / 2) % mod));

            }
        }

       
      
        int k = list.size();
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                count = (int)((count + (1L * list.get(i) * list.get(j)) % mod) % mod);
            }
        }
        // int pod=1;
        // for(int i=0;i<k;i++){
        //     pod=(int )(1L * pod*list.get(i)) % mod;
        // }
        //   int count = pod;
        // for(int i=0;i<k;i++){
        //     count =(count + pod/list.get(i))%mod ;
        // }

        return count;
    }

   
    // public int sumUpToN(int n, int[] dp) {
    //     if (n == 0 || n == 1) return n;
    //     if (dp[n] != -1) return dp[n];
    //     dp[n] = (n + sumUpToN(n - 1, dp)) % mod;
    //     return dp[n];
    // }
}
