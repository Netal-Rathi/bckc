class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;

        // Even indices get 5, odd indices get 4
        long evens = (n + 1) / 2;  // Count of even positions
        long odds = n / 2;        // Count of odd positions

        // Calculate modular exponentiation
        long powerOf5 = modularExponentiation(5, evens, mod);
        long powerOf4 = modularExponentiation(4, odds, mod);

        // Return the result modulo 10^9 + 7
        return (int) ((powerOf5 * powerOf4) % mod);
    }

    // Modular exponentiation to compute (base^exp) % mod
    private long modularExponentiation(long base, long exp, long mod) {
        long result = 1;
        base %= mod;  // Ensure base is within mod range

        while (exp > 0) {
            if (exp % 2 == 1) {  // If exp is odd, multiply result by base
                result = (result * base) % mod;
            }
            base = (base * base) % mod;  // Square the base
            exp /= 2;
        }

        return result;
    }
}

// Title: Count Good Numbers
