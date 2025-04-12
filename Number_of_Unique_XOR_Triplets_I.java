import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> uniqueXors = new HashSet<>();
        HashMap<Integer, Integer> pairXors = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int xor = nums[i] ^ nums[j];
                pairXors.put(i * nums.length + j, xor);
            }
        }
        
        for (int k = 0; k < nums.length; k++) {
            for (var entry : pairXors.entrySet()) {
                int ij = entry.getKey();
                int j = ij % nums.length;
                if (j <= k) {
                    uniqueXors.add(entry.getValue() ^ nums[k]);
                }
            }
        }
        
        return uniqueXors.size();
    }
}
// Title: Number of Unique XOR Triplets I
