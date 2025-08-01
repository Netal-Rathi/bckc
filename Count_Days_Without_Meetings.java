class Solution {
    public int countDays(int days, int[][] meetings) {
        int count=0;
      int[][] arr=  merge(meetings);
        for(int [] edge: arr){
                count+=edge[1]-edge[0]+1;
        }
        return days-count;
    }

      public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int m=intervals[0].length;
        int n=intervals.length;
        int arr[][]=new int [n][m];
     //   ArrayList<int[]> arr=new ArrayList<>()
        int j=0;
        arr[0][0]=intervals[0][0];
        arr[0][1]=intervals[0][1];

        for(int i=1;i<n;i++){
 if (arr[j][1] >= intervals[i][0]) { 
                // Merge intervals
                arr[j][0] = Math.min(arr[j][0], intervals[i][0]);
                arr[j][1] = Math.max(arr[j][1], intervals[i][1]);
                
            }else{
                j++;
                  arr[j][0]=intervals[i][0];
                arr[j][1]=intervals[i][1];
              //  j++;
                
            }
        }
        int [][] result=new int[j+1][2];
        for(int i=0;i<j+1;i++){
            result[i][0]=arr[i][0];
            result[i][1]=arr[i][1];
        }
        return result;
    }
}
// Title: Count Days Without Meetings
