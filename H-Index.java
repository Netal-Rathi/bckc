class Solution {
    public int hIndex(int[] citations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_h=Integer.MIN_VALUE;
        Arrays.sort(citations);
        for(int i = 0;i<citations.length;i++ ){
            map.put(citations[i],citations.length-i);
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