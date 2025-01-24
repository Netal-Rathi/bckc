class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> list=new ArrayList<>();
            list.add(new ArrayList<>(helper( nums2, nums1)));
            list.add(new ArrayList<>(helper( nums1,  nums2)));
            
            return list;
                
    }
    public List<Integer> helper(int[] nums1, int[] nums2) {
    
        
           Set <Integer> set=new HashSet<>();
            Set <Integer> set2=new HashSet<>();

            for(int i=0;i<nums1.length;i++){
                set.add(nums1[i]);
            }

                for(int i=0;i<nums2.length;i++){
                    if(!set.contains(nums2[i])){
                        set2.add(nums2[i]);
                    }
                }
                return new ArrayList<>(set2);
    }
}
// Title: Find the Difference of Two Arrays
