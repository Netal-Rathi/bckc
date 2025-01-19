class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;

        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            // Multiply results of helper and take modulo
            long ans = (helper(5, n / 2) % mod) * (helper(4, n / 2) % mod);
            return (int) (ans % mod);
        } else {
            // Multiply results of helper for odd case and take modulo
            long ans = (helper(5, n / 2 + 1) % mod) * (helper(4, n / 2) % mod);
            return (int) (ans % mod);
        }
    }

    public int helper(long n1, long m) {
        long mod = 1000000007;

        if (m == 0) {
            return 1;
        }

        if (m < 0) {
            return (int) (helper(1 / n1, -m) % mod);
        }

        if (m % 2 == 0) {
            return (int) (helper(n1 * n1, m / 2) % mod);
        } else {
            return (int) ((n1 * helper(n1 * n1, m / 2)) % mod);
        }
    }
}
