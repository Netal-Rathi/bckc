class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int mid1=0,mid2=0;
        int i=0,j=0,count=0;
        int total=m+n;

        while(count<=total/2){
            mid1=mid2;
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    mid2=nums1[i++];
                }else{
                    mid2=nums2[j++];
                }
            }else{
                if(i<m){
                     mid2=nums1[i++];

                }
                if(j<n){
                             mid2=nums2[j++];

                }
            }
            count++;
        }
        if(total%2!=0){
            return (double)mid2;
        }else{
                System.out.println(mid1);
                System.out.println(mid2);

            return (mid1+mid2)/2.0;
        }
        
    }
}