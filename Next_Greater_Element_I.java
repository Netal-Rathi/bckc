class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        boolean check=false;
        int k=0;

        for(int num : nums1){
            int i=0;
            while(num!=nums2[i]){
                i++;
            }
            if(i==nums2.length-1){
               ans[k]=-1;
                k++;
            }else{
            for(int j=i+1;j<nums2.length;j++){

                if(nums2[i]<nums2[j]){
                        ans[k]=nums2[j];
                        k++;
                        check=true;
                        break;
                }
            }
            if(!check){
            ans[k]=-1;
            k++;
            }
            }
        }
        return ans;
    }
}