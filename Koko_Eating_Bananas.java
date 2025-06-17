class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MAX_VALUE;
        System.out.println(right);
       int min=0;

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
            if(piles[i]<=mid){
                count+=1;
            }else if(piles[i]%mid!=0){
            count+= piles[i]/mid + 1; 
            }else{
                count+=piles[i]/mid;
            }

    }
System.out.println(count);
    return count<=h ? true : false;
}
}
// Title: Koko Eating Bananas
