class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }

        }
        return n==0 ? true : false ;
        
    }
}
// Title: Can Place Flowers
