class KthLargest {

private int k;
private int nums[];
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
            Arrays.sort(this.nums);
           // return nums[k];
       
        }       
    
    
    public int add(int val) {
       int ans[]=new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
       }
       ans[nums.length]=val;
       Arrays.sort(ans);
       nums=ans;
       return nums[ans.length-k];

        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */