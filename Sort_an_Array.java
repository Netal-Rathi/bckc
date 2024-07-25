class Solution {

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] nums, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sort(nums, start, middle);
            sort(nums, middle + 1, end);
            merge(nums, start, middle, end);
        }
    }

    private void merge(int[] nums, int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = nums[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = nums[middle + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}

// Title: Sort an Array
