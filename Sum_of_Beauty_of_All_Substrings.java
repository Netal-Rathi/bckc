import java.util.*;

class Solution {

    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int arr[]=new int[26];
            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j)-'a']++;
                 sum += calc(arr);

                
            }
           
        }
        return sum;
    }

    public int calc(int arr[]) {
        int maxv=0,minv=Integer.MAX_VALUE;
       for(int elem : arr){
        if(elem>0){
        maxv=Math.max(maxv,elem);
        minv=Math.min(minv,elem);
        }

       }
       return maxv-minv;
    }
}

// Title: Sum of Beauty of All Substrings
