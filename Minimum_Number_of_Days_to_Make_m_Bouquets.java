class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<bloomDay.length;i++){
        //     map.put(bloomDay[i],map.getOrDefault(bloomDay[i],0)+1);
        // }
        int start=1;
        int end=Arrays.stream(bloomDay).max().getAsInt();
        int min=end;
        while(start<end){
            int middle=start+ (end-start)/2;

            if(check(bloomDay,m,k,middle)){
                min=middle;
                System.out.println(min);
                end=middle-1;
            }else{
                start=middle +1;
            }
        }
        return min;

        
    }

   public boolean check(int[] bloomDay, int m, int k, int mid) {
    int bouquets = 0;
    int flowers = 0;

    for (int day : bloomDay) {
        if (day <= mid) {
            flowers++;
            if (flowers == k) {
                bouquets++;
                flowers = 0;
            }
        } else {
            flowers = 0; // reset since flowers must be adjacent
        }
    }
    return bouquets >= m;
}

}
// Title: Minimum Number of Days to Make m Bouquets
