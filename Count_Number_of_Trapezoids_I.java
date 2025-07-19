class Solution {
    public int countTrapezoids(int[][] points) {
        int mod=1000000007;
         Map<Integer,Integer> map=new HashMap<>();
      //  List<Integer> toremove=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        //count : 
        for(int [] arr : points ){
            map.put(arr[1],map.getOrDefault(arr[1],0)+1);
        }

          // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          //       int s=entry.getValue();
          //      if(s==1){
          //         // map.remove(s);
          //          toremove.add(entry.getKey());
          //      }
          // }
        // replace by factorial : 
           for(Map.Entry<Integer,Integer> entry : map.entrySet()){
               
               int s=entry.getValue();
               if(s>=2){
               
               int dp[] =new int[s];
               Arrays.fill(dp,-1);
               map.put(entry.getKey(),factorial(s-1,dp));
                   list.add(entry.getValue());
         System.out.println(entry.getKey() + "  "  + entry.getValue());
               }
               //    System.out.print(entry,getValue);
                   
               
           }
        
int count=0;
        // for(Map.Entry<Integer,Integer> i : map.entrySet()){
        //     for(Map.Entry<Integer,Integer> j : map.entrySet()){
        //         count+=(i.getValue())%mod *(j.getValue())%mod;
                
        //     }
        // }
int k=list.size();
        for(int i=0;i<k-1;i++){
            for(int j=i+1;j<k;j++){
                count+=((list.get(i))%mod *(list.get(j))%mod)%mod;
                
            }
        }
            // count+=entry.getValue();
          return count%mod;
        }
       
        
    


    public int factorial(int n,int [] dp ){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
            
        }
        dp[n]=Math.abs(n)+factorial(Math.abs(n-1),dp);
        return dp[n];
    }
}