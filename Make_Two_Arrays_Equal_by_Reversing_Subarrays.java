class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
     Set<Integer> set = new HashSet<>();
        for (int num : target) {
            set.add(num);
        }
        
        for (int num : arr) {
            if (!set.contains(num)) {
                return false;
            }
        }
        
        return true;
    }
}