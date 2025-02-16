class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0){
            System.out.println(nums1);
        }

            if (m==0){
                for(int i=0;i<n;i++){
                    nums1[i]=nums2[i];

                }
                System.out.println(nums2);
            }
        // int x=Math.max(m,n)
        // int j=0;
        // for(int i=0;i<x;i++){
        //     if(nums1[i]<nums2[i] && nums1[i]!=0){
        //         continue;
        //         j++;
        //     }else if (nums1[i]==nums2[i] == nums1[i]!=0){
        //        for(int k=i+1;k<=m+n;k++){
                
        //        }
        //         nums1[++j]=nums2[i];

        //     }

        // }
        int j=0;
         for(int i=m ; i<m+n;i++){
            nums1[i]= nums2[j];
            j++;
         }
         Arrays.sort(nums1);
         System.out.println(nums1);
    }
}