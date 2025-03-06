class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++){
                if(i==2 || i==3){
                    count++;
                }else if(i%2==0 || i%3==0 ){
                    continue;
                }else if(i>=5){
                    for(int j=5;j*j<i;j+=6){
                        if(i%(j-1)==0 || i%(j+1)==0){
                            continue;
                        }

                    }
                    count++;
                    
                }else{
                    count++;
                }
        }
        return count;
    }
}
// Title: Count Primes
