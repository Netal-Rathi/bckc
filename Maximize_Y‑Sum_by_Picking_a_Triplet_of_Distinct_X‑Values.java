class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<x.length;i++){
          //  map.put(x[i],)
            if(map.containsKey(x[i])){
                map.put(x[i],Math.max(map.get(x[i]),y[i]));
            }else{
                map.put(x[i],y[i]);
            }
        }
List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            list.add(entry.getValue());
            
        }
        Collections.sort(list,Collections.reverseOrder());
        int sum=-1;
        if(list.size()>=3)
     sum=list.get(0)+list.get(1)+list.get(2);
        return sum;
    }
}
// Title: Maximize Y‑Sum by Picking a Triplet of Distinct X‑Values
