class Solution {
    public int hIndex(int[] citations) {

        int max_h = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {

            if (citations.length - i <= citations[i]) {
                max_h = Math.max(max_h, citations.length - i);
            }
        }

        return max_h;
    }
}