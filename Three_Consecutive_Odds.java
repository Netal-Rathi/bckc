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
        if(count==3){
            return true;
        }
        for(int i=end;i<arr.length;i++){
            if(count==3){
                return true;
            }
             start=start+1;
             if(arr[start]%2!=0){
            count--;
             }
            if(arr[i]%2!=0){
                count++;
            }
           
            
        }
        return count==3?true:false;
    }
}