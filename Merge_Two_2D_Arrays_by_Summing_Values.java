import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < nums1.length) {
            list.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }

        // Add remaining elements from nums2
        while (j < nums2.length) {
            list.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        // Convert List<int[]> to int[][]
        return list.toArray(new int[list.size()][]);
    }
}

// Title: Merge Two 2D Arrays by Summing Values
