class Solution {
    public boolean checkPowersOfThree(int n) {
       ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            int x=0;
            while(Math.pow(3,x)<=n){
                x++;

            }
            x--;
            if(list.contains(x)){
                return false;
            }
            int y=(int)Math.pow(3,x);
            list.add(x);
            n=n-y;
        }
        return n==0 ? true :false;
    }
}
// Title: Check if Number is a Sum of Powers of Three
