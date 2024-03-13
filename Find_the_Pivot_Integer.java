class Solution {
    public int pivotInteger(int n) {
     
        int ans=0;
        int x=1;
        if(n==1){
            return 1;
        }
        while(x!=n+1){
               int sumbef=0;
               int sumaft=0;
        for(int i=1;i<=x;i++){
                sumbef+=i;
        }
        for(int i=x;i<=n;i++){
                sumaft+=i;
        }
        if(sumbef==sumaft){
            ans=x;
            break;
            
        }else{
        x++;
        }
       
        }
        if(ans!=0){
            return ans;
            }else{
                return -1;
            }
       
       
    }
}