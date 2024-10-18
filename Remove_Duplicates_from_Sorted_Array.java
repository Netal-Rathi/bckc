class Solution {
    public int removeDuplicates(int[] nums) {
        
        List <Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(l1.isEmpty() || l1.get(l1.size()-1)!=nums[i]){
               l1.add(nums[i]);
            }
        }

        for(int i=0;i<l1.size();i++){
              nums[i] = l1.get(i);
        }


        for (int i=l1.size();i<nums.length;i++){
            nums[i]='_';
        }
        return l1.size();
    }
}
// Title: Remove Duplicates from Sorted Array
