class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        int xor = 0;

        // Step 1: Compute XOR of all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor ^= i;
        }

        // Step 2: Compute XOR of all numbers in the grid
        int repeated = -1, missing = -1;
        for (int[] row : grid) {
            for (int num : row) {
                xor ^= num;
            }
        }

        // Step 3: Find the rightmost set bit in xor
        int rightmostBit = xor & -xor; // This isolates the differing bit

        // Step 4: Divide numbers into two groups
        int xor1 = 0, xor2 = 0;
        for (int i = 1; i <= N; i++) {
            if ((i & rightmostBit) == 0) {
                xor1 ^= i;
            } else {
                xor2 ^= i;
            }
        }
        for (int[] row : grid) {
            for (int num : row) {
                if ((num & rightmostBit) == 0) {
                    xor1 ^= num;
                } else {
                    xor2 ^= num;
                }
            }
        }

        // Step 5: Identify which is the missing and repeated number
        for (int[] row : grid) {
            for (int num : row) {
                if (num == xor1) {
                    repeated = xor1;
                    missing = xor2;
                    break;
                } else if (num == xor2) {
                    repeated = xor2;
                    missing = xor1;
                    break;
                }
            }
        }

        return new int[]{repeated, missing};
    }
}

// Title: Find Missing and Repeated Values
