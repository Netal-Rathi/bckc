import java.util.*;

class Solution {
    int count = 0;

    public int specialTriplets(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int mod = 1000000007;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list1 = entry.getValue();

            if (list1.size() >= 2) {
                int key = entry.getKey();
                int halfKey = key / 2;

                if ( key%2==0 && map.containsKey(halfKey)) {
                    List<Integer> list2 = map.get(halfKey);
                    int l1 = list1.size();
                    int l2 = list2.size();

                    for (int k = 0; k < l2; k++) {
                        for (int i = 0; i < l1 - 1; i++) {
                            for (int j = i + 1; j < l1; j++) {
                                if (list2.get(k) > list1.get(i) && list2.get(k) < list1.get(j)) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count % mod;
    }
}

// Title: Count Special Triplets
