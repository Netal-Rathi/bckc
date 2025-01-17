class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int ans[]=new int[n];
        ans[0]=0;
         System.out.print(ans[0]);
        for(int i=1;i<n-1;i++){
            if(derived[i]==0 ){
                ans[i]=ans[i-1];
                 System.out.print(ans[i]);
            }else{
                ans[i]=(1-ans[i-1]);
                 System.out.print(ans[i]);
            }
        }
        if(derived[n-1]==0){
            ans[n-1]=ans[0];
        }else{
            ans[n-1]=1-ans[0];
        }
     //   System.out.print(ans[n-1]);

         for(int i=0;i<n-1;i++){
       
            if(derived[i]!= (ans[i] ^ ans[i+1])){
                    return false;
            }
        }
        if(derived[n-1] != (ans[0] ^ ans[n-1])){
            return false;
        }
        return true;
        
    }
}
// Title: Neighboring Bitwise XOR
