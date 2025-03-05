class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[2];
        
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int[] row : grid){
        for(int num:row){
            map.put(num,map.getOrDefault(num,0)+1);
        }
      }
       for(int i=1;i<= n * n ;i++){
     int count=   map.getOrDefault(i,0);
     if(count==0){
        arr[1]=i;
     }else{
        if(count==2){
            arr[0]=i;
        }
     }
       }
      
return arr;
        
    }
}
// Title: Find Missing and Repeated Values
