class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        if (flowerbed.length==1 ) {
             if(flowerbed[0]==0 &&  n==1){
            return true;
             }else{
                return false;
             }
        }

        for (int i = 0; i < flowerbed.length; i++) {

            if ( (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) || (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0)
                    || (i > 0 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0))
                     {
                flowerbed[i] = 1;
                n--;
            }

        }
        System.out.println(n);
        return n <= 0 ? true : false;

    }
}