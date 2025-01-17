class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans[]=new int[derived.length];
        for(int i=0;i<derived.length-1;i++){
            if(derived[i]==1){
                ans[i]=0;
                ans[i+1]=1;
                i++;
            }else{
                ans[i]=0;
                ans[i+1]=0;
                i++;
            }
        }
        if(derived.length%2!=0 ){
            
            if(derived[derived.length-1]==1 ){
                ans[derived.length-1]= (1-ans[0]);
            }else{
                ans[derived.length-1]=ans[0];
            }

        }

        for(int i=0;i<derived.length-1;i++){
       
            if(derived[i]!= (ans[i] ^ ans[i+1])){
                    return false;
            }
        }
        if(derived[derived.length-1] != (ans[0] ^ ans[derived.length-1])){
            return false;
        }
        return true;
    }
}