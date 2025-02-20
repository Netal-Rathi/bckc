class Solution {
    public String findDifferentBinaryString(String[] nums) {
        return  helper(nums,"" ,0);
    }public String helper(String[] nums ,String ans ,int n){
        if(n==nums.length){
             if(!Arrays.asList(nums).contains(ans)){
                return ans;
              // break;
             }
             return null;
        }

     

           String result= helper(nums,ans + '0' ,n+1);
           if(result!=null)
            return result;
           

             result= helper(nums,ans + '1' ,n+1);
              return result;
             
    }


}
// Title: Find Unique Binary String
