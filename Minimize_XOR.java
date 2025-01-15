class Solution {
    public int minimizeXor(int num1, int num2) {
        int count1 = Integer.bitCount(num1); // Count set bits in num1
        int count2 = Integer.bitCount(num2); // Count set bits in num2

        if (count1 == count2) {
            return num1;
        }

        // Convert num1 to binary and use StringBuilder for manipulation
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num1));
        
        // If num1 has more set bits than num2, reduce the set bits in num1
        if (count1 > count2) {
            int bitsToRemove = count1 - count2;
            for (int i = sb.length() - 1; i >= 0 && bitsToRemove > 0; i--) {
                if (sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                    bitsToRemove--;
                }
            }
        } else { // If num1 has fewer set bits than num2, add more set bits to num1
            int bitsToAdd = count2 - count1;
            for (int i = sb.length() - 1; i >= 0 && bitsToAdd > 0; i--) {
                if (sb.charAt(i) == '0') {
                    sb.setCharAt(i, '1');
                    bitsToAdd--;
                }
            }
            // If more bits need to be added, prepend '1's to the binary string
            while (bitsToAdd > 0) {
                sb.insert(0, '1');
                bitsToAdd--;
            }
        }

        // Convert the binary string back to an integer
        return Integer.parseInt(sb.toString(), 2);
    }
}
