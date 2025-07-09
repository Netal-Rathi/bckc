class Solution {
    public int minDistance(String word1, String word2) {
        
        int n=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n][n2];
        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }
        int x= check(0,0,word1,word2,dp);
        return (n-x )+ (n2-x);
        
    }
        public int check(int idx1, int idx2, String s1,String s2, int [][] dp){

        if(idx1==s1.length() || idx2==s2.length()){

            return 0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            dp[idx1][idx2]=1+ check(idx1+1,idx2+1,s1,s2,dp);
        }else{
            dp[idx1][idx2]=Math.max(
                check(idx1+1,idx2,s1,s2,dp),
                check(idx1,idx2+1,s1,s2,dp)
            );
           
        }
         return dp[idx1][idx2];

    }
}