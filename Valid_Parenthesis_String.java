class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int left=0,right=0,any=0;
        for(int i=0;i<n;i++){

            if(s.charAt(i)=='('){
                left++;
            }else if(s.charAt(i)==')'){
                right++;
            }else{
                any++;
            }
        }
        if(left==right){
            return true ;
        }else if (left>right && right+any>=left){
            return true ;
        }else if(right>left && left+any>=right){
            return true;
        }else{
            return false;
        }
        
    }
}