class Solution {
    public int uniqueXorTriplets(int[] nums) {
         if(nums.length==1){
        return 1;
      }
      if(nums.length==2){
        return 2;
      }
        Arrays.sort(nums);
        String a=Integer.toBinaryString(nums[0]);
         String b=Integer.toBinaryString(nums.length-1);
         int ans=(int)(Math.pow(2,b.length()))- (int)(Math.pow(2,a.length()));
         return Math.abs(ans);
        
    }
}
// Title: Number of Unique XOR Triplets II
