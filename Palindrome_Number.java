class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0;
        int real_no=x;
        while(x!=0){
            int temp=x%10;
            reverse=reverse*10 + temp;
            x=x/10;
        }
        return (reverse==real_no);
         
        
    }
}
// Title: Palindrome Number
