class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
Integer[] indices=new Integer[heights.length];
for(int i=0;i<heights.length;i++){
    indices[i]=i;

}

    Arrays.sort(indices,(a,b)->Integer.compare(heights[b],heights[a]));

        String[] sorted=new String[names.length];
        for(int i=0;i<names.length;i++){
            sorted[i]=names[indices[i]];
        }
        return sorted;
    }
}