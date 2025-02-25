class Solution {
    public boolean isHappy(int n) {
        if(n==0){
            return false;
        }
        int sum=0;
     //  List<Long> ans=new ArrayList<>();
   //   HashMap<Long,Integer> ans=new HashMap<>();
   Set<Integer> ans=new HashSet<>();

        while( n!=1 && !ans.contains(sum)   ){
             ans.add(sum);
            sum=0;
          
            while(n!=0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
           
        }
        return n==1;
        
    }
}