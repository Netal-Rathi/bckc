// class Solution {
//     public String findDifferentBinaryString(String[] nums) {
//         return  helper(nums,"" ,0);
//     }public String helper(String[] nums ,String ans ,int n){
//         if(n==nums.length){
//              if(!Arrays.asList(nums).contains(ans)){
//                 return ans;
//               // break;
//              }
//              return null;
//         }

     

//            String result= helper(nums,ans + '0' ,n+1);
//            if(result!=null)
//             return result;
           

//              result= helper(nums,ans + '1' ,n+1);
//               return result;
             
//     }


// }



class Solution {
    public String findDifferentBinaryString(String[] nums) {
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<nums.length;i++){
        ans.append(nums[i].charAt(i)== '0' ? '1' : '0');

    }
    return ans.toString();
    }
}
// Title: Find Unique Binary String
