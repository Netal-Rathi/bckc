class Solution {
    public String addBinary(String a, String b) {
        // Padding with leading zeros
        while (a.length() < b.length()) {
            a = '0' + a;
        }
        while (b.length() < a.length()) {
            b = '0' + b;
        }

        StringBuilder result = new StringBuilder();
        char carry = '0';

        for (int i = a.length() - 1; i >= 0; i--) {
            char[] res = checker(a.charAt(i), b.charAt(i), carry);
            result.append(res[0]);
            carry = res[1];
        }

        // Append remaining carry
        if (carry == '1') {
            result.append('1');
        }

        return result.reverse().toString();
    }

    
    public char[] checker(char a, char b, char c) {
        char[] arr = new char[2]; 
        int sum = (a - '0') + (b - '0') + (c - '0'); 
        arr[0] = (char) ((sum % 2) + '0'); 
        arr[1] = (char) ((sum / 2) + '0'); 

        return arr;
    }
}
