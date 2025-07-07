class FindSumPairs {
        int []nums1;
        int []nums2;
          HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.map=new HashMap<>();
           for(int i:nums2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
       
        
    }
    
    public void add(int index, int val) {
        // if(index<nums2.length){
        //     ans-map.get(nums2[index]);
        // nums2[index]+=val;

        // }
        int n=nums2[index];
        map.put(n,map.get(n)-1);
        nums2[index]+=val;
        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);

        
    }
    
    public int count(int tot) {
        // if(check){
        //     return ans;
        // }
        int ans=0;
      
      
        // for(int i:nums1){
        //     map.put(tot-i,map.getOrDefault(tot-i,0)+1);
        // }

        // for(int i:nums2){
        //     if(map.containsKey(i)){
        //         ans+=map.get(i);
        //     }
        // }
        

        for(int i:nums1){
            if(map.containsKey(tot-i)){
                ans+=map.get(tot-i);
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
// Title: Finding Pairs With a Certain Sum
