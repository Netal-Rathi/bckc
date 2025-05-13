class Solution {
    public int lengthAfterTransformations(String s, int t) {
        // 97 -122 
                int mod=1000000007;
                int ans=0;
                int[] count=new int [26];
                for(char ch:s.toCharArray()){
                    count[ch-'a']++;
                }

                for(int i=0;i<t;i++){
                    int [] arr=new int [26];
                    arr[0]=count[25]%mod;
                    arr[1]=(count[25] + count [0])%mod;
                    for(int j=2;j<26;j++){
                        arr[j]=count[j-1]%mod;
                    }
                    count=arr;
                }

                for(int i=0;i<26;i++){
                    ans=(ans+count[i])%mod;
                }
                return ans ;

    }
    
}
// Title: Total Characters in String After Transformations I
