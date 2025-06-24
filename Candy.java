class Solution {
    public int candy(int[] ratings) {
        int count=0;
        int var=1;

        for(int i=0;i<ratings.length;i++){

            if(i==0 ){
                if(ratings[i]>ratings[i+1]){
                var++;
                count+=var;
                }else{
                    count+=1;
                }
            } else if(i==ratings.length-1){
                if(ratings[i]>ratings[i-1]){
                    var++;
                    count+=var;

                }else{
                    count+=1;
                    
                }

            }else if(ratings[i+1]<ratings[i] || ratings[i]>ratings[i-1]){
                   var++;
                count+=var;
             
            }else{
                count+=1;
                var=1;
            }

        }
        return count;
    }
}
// Title: Candy
