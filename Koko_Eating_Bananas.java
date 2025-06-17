class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        System.out.println(right);
       int min=right;

        while(left<=right){
            int middle=left + (right-left )/2;
            if(check(piles,h,middle)){
                min=middle;
                right=middle-1;
            }else{
                left=middle +1;
            }
        }
        return min;
        
    }

    public Boolean check(int [] piles ,int h ,int mid){
          int count =0;
          for (int i=0;i<piles.length;i++){
          // count+=Math.ceil(piles[i]/mid);
          count+=(piles[i]+ mid -1)/mid;

    }
System.out.println(count);
    return count<=h ? true : false;
}
}
// Title: Koko Eating Bananas
