class FindSumPairs {
        int []nums1;
        int []nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        
    }
    
    public void add(int index, int val) {
        if(index<nums2.length){
        nums2[index]+=val;
        }

        
    }
    
    public int count(int tot) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(tot-i,map.getOrDefault(tot-i,0)+1);
        }

        for(int i:nums2){
            if(map.containsKey(i)){
                ans+=map.get(i);
            }
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */