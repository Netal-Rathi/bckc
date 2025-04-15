class Solution {
    public boolean isPowerOfFour(int n) {
        return (powerof2(n) && isevenplace(n));
    }
    public boolean powerof2(int n){
        return (n>0 && ((n & (n-1))==0));
    }

    public boolean isevenplace(int n){
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==1 && i%2!=0){
                return false;

            }
        }
        return true;
    }
}
// Title: Power of Four
