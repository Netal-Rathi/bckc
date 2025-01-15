class Solution {
    public int minimizeXor(int num1, int num2) {
        if(Integer.bitCount(num1)==Integer.bitCount(num2)){
            return num1;
        }
        int num3=num1+(num1*2);
        return num3;
        
    }
}
// Title: Minimize XOR
