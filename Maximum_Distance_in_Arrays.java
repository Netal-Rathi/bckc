class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(List<Integer> list : arrays){
            if(min>Collections.min(list)){
                min=Collections.min(list);
            }else{

            if(max<Collections.max(list)){
                max=Collections.max(list);
            }
            }
        }
        System.out.println(max);
        System.out.println(min);
    return max-min;
        
        
    }
}