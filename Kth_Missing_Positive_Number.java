class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int j = 1;
        int i = 0;

        while (count < k) {
            if (i < n && arr[i] == j) {
                i++;
            } else {
                count++;
                if (count == k) return j;
            }
            j++;
        }

        return j;
    }
}

// Title: Kth Missing Positive Number
