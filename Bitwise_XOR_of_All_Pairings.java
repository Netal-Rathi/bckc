class Solution {

    public int xorAllNums(int[] nums1, int[] nums2) {
         int result=0;
       // int ans[]=new int[nums1.length*nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                //ans[i]=nums1[i]^nums2[j];
               result=result^(nums1[i]^nums2[j]);
                System.out.print(result);

            }
        }
        
        System.out.println();
        System.out.print(0^4);

       
        // for(int i=0;i<ans.length/2;i+=2){
        //     result=result^(ans[i]^ans[i+1]);
        // }
        // if(ans.length%2!=0){
        //     result=result^ans[ans.length-1];
        // }
        return result;
    }
}