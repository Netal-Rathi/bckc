class Solution {
    public int hIndex(int[] citations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // if(citations.length==1 && citations[0]==0){
        //     return 0;
        // }
        int max_h=0;
        Arrays.sort(citations);
        for(int i = 0;i<citations.length;i++ ){
            if(citations[i]!=0)
            map.put(citations.length-i , citations[i]);
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey() <= (entry.getValue())){
                max_h=Math.max(max_h,entry.getKey());
            }
        }
       return max_h;
    }
}