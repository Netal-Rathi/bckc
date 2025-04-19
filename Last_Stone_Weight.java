class Solution {
    public int lastStoneWeight(int[] stones) {
     List<Integer> list=new ArrayList<>();
     for(int i : stones){
        list.add(i);
     }
     int x=0;
     int y=0;
     while(list.size()>1){
        Collections.sort(list,Collections.reverseOrder());
        y=list.get(0);
        x=list.get(1);
         list.remove(1);
         list.remove(0);
       
        if(x!=y){
                list.add(y-x);
        }

     }
       return list.isEmpty()? 0:list.get(0)  ;
    }
    
        
        
}
// Title: Last Stone Weight
