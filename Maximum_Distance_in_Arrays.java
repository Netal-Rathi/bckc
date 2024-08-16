class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Collections.min(arrays.get(0));
        int max=Collections.max(arrays.get(0));
        int maxdist=0;
        for(int i=1;i<arrays.size();i++){
            List<Integer> list=arrays.get(i);
            int currentmin= Collections.min(list);
            int currentmax=Collections.max(list);
            maxdist=Math.max(maxdist,Math.abs(max-currentmin));
            maxdist=Math.max(maxdist,Math.abs(currentmax-min));

            min=Math.min(min,currentmin);
            max=Math.max(max,currentmax);

        }
        System.out.println(max);
        System.out.println(min);
    return maxdist;
        
        
    }
}