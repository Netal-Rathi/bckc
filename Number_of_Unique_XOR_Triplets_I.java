class Solution {
    public int uniqueXorTriplets(int[] nums) {
      if(nums.length==1){
        return 1;
      }
      if(nums.length==2){
        return 2;
      }
      //int n=nums.length;
   
      String b=Integer.toBinaryString(nums.length);
     int n=b.length();
      
      return (int)Math.pow(2,n);
    }
}
// Title: Number of Unique XOR Triplets I
