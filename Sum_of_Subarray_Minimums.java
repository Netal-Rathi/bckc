class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
         // int[] arr = {1, 2, 3};
        List<List<Integer>> allSubarrays = new ArrayList<>();
        generateSubarrays(arr, 0, 0, allSubarrays);
        int sum=0;
        int module=1000000007;
        
        // Print all subarrays
        for (List<Integer> subarray : allSubarrays) {
            sum+=Collections.min(subarray)%module;
        }
        return sum;
        
    }

    
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     List<List<Integer>> allSubarrays = new ArrayList<>();
    //     generateSubarrays(arr, 0, 0, allSubarrays);
    //     int sum=0;
    //     int mod=1000000007;
        
    //     // Print all subarrays
    //     for (List<Integer> subarray : allSubarrays) {
    //         sum+=Collections.min(subarray)%mod;
    //     }
    // }

    static void generateSubarrays(int[] arr, int start, int end, List<List<Integer>> result) {
        if (start == arr.length) {
            return;
        }

        // When end reaches the end of array, increase start
        else if (end == arr.length) {
            generateSubarrays(arr, start + 1, start + 1, result);
        }

        // Generate current subarray and recurse
        else {
            List<Integer> subarray = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                subarray.add(arr[i]);
            }
            result.add(subarray);
            generateSubarrays(arr, start, end + 1, result);
        }
    }
}