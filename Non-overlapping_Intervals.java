class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        
        int count=0;

 int i=1;
       
        int prev=intervals[0][1];
        while(i!=intervals.length){
            if(prev==intervals[i][0]){
                // if(j!=0 && j<i){
                //     count+=i-j;
                // }
                prev=intervals[i][1];
               // j=0;
                
            }else{
                count++;

            }
            i++;
            

        }
        return count;
        
    }
}
// Title: Non-overlapping Intervals
