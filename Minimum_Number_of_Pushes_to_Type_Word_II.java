class Solution {
    public int minimumPushes(String word) {
          HashMap<Character,Integer> unique=new HashMap<>();
        for( int i=0;i<word.length();i++){
            unique.put(word.charAt(i),unique.getOrDefault(word.charAt(i),0)+1);
        }
            int sum=0;
            int i=0;
            Integer[] arr = new Integer[unique.size()];
            for(Map.Entry<Character,Integer> set1: unique.entrySet()){
                arr[i++]=set1.getValue();
                //i++;
            }

           Arrays.sort(arr,Collections.reverseOrder());
            for (i = 0; i < arr.length; i++) {
                if(i >=0 && i<=7){
                    sum=sum+arr[i];
                }else if(i>=8 && i<=15){
                    sum=sum+(arr[i]*2);
                }else if (i>=16 && i<=23){
                    sum=sum+(arr[i]*3);
                }else{
                    sum=sum+(arr[i]*4);
                }
            }
      
            return sum;
        
    }
}
// Title: Minimum Number of Pushes to Type Word II
