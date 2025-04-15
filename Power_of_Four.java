class Solution {
    public boolean isPowerOfFour(int n) {
        return (n!=2 && n>0 && isPowerOfTwo(n) && isevenplace(n));
    }
      public boolean isPowerOfTwo(int n) {
       if(n>0 && (( n & (n-1))==0)){
        return true;
       }
        return false;
    }

    public boolean isevenplace(int n){
        String s=Integer.toBinaryString(n);
        s=new StringBuilder(s).reverse().toString();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&& i%2!=0){
                 System.out.println(i);
                return false;

            }
        }
        return true;
    }
}
// Title: Power of Four
