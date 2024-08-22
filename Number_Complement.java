class Solution {
    public int findComplement(int num) {
        // Get the binary length of num
        int bitLength = Integer.toBinaryString(num).length();
        
        // Create a mask with all bits set to 1 of the same length as num's binary representation
        int mask = (1 << bitLength) - 1;
        
        // XOR num with the mask to flip all bits
        return num ^ mask;
    }
}

// Title: Number Complement
