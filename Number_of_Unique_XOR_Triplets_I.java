class Solution {
    public int uniqueXorTriplets(int[] nums) {
      if(nums.length==1){
        return 1;
      }
      if(nums.length==2){
        return 2;
      }
      //int n=nums.length;
      int n=0;
      if(nums.length>=3){
      String b=Integer.toBinaryString(nums.length);
      n=b.length();
      }
      return (int)Math.pow(2,n);
    }
}