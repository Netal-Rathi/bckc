import java.util.*;

class Solution {
    public long repairCars(int[] ranks, int cars) {
     //   Arrays.sort(ranks);
    long left=1;
    long right=(long) ranks[0]*(long) cars* (long) cars;
    long ans=right;

    while(left<=right){
      long mid=left+(right-left ) /2;
      if(isall(ranks,cars,mid)){
        ans=mid;
        right=mid-1;
      }else{
        left=mid+1;
      }

    }
    return ans;
    }

    public boolean isall(int[] ranks , int cars , long mid){
long current=0;
        for(int rank : ranks){
            current+=Math.sqrt(mid/rank);
            if(current>=cars){
                return true;
            }
           
        }
         return current >= cars;
    }
     
}

// Title: Minimum Time to Repair Cars
