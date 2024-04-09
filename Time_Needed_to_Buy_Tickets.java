class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        /*ArrayList <Integer> tic=new Arraylist<>();
        for(int t : tickets ){
            tic.add(t);
        } */
        while(tickets[k]>=0){
  for(int i=0;i<tickets.length;i++){
        
            if(tickets[i]!=0){
                tickets[i]=tickets[i]-1;
                time ++;
            }else{
                continue;
            }
        
  }
        }
  return time;
        
    }
}