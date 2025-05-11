class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int start=0,end=3,count=0;
        for(int i=0;i<3;i++){
            if(arr[i]%2!=0){
                count++;
            }

        }
       
        for(int i=end;i<arr.length;i++){
            if(count==3){
                return true;
            }
            
             if(arr[start]%2!=0){
            count--;
             }
              start=start+1;
            if(arr[i]%2!=0){
                count++;
            }
           
            
        }
        return count==3?true:false;
    }
}
// Title: Three Consecutive Odds
