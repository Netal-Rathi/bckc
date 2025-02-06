class Solution {
    public int longestConsecutive(int[] nums) {
        // time complexity : nlogn
    //     if(nums.length==0){
    //         return 0;
    //     }
    //     Arrays.sort(nums);
    //     System.out.println(Arrays.toString(nums));
    //     return helper(nums,1,1,0);
    // }
    // public int helper(int [] nums ,int n,int count,int ans){
    //         if(n==nums.length ){
    //             return Math.max(count,ans);
    //         }

    //         if(nums[n]==nums[n-1]){
    //             return helper(nums,n+1,count,ans);

    //         }
            

    //         if( n==0 || nums[n]==nums[n-1]+1 ){
    //          //   count++;
    //            return helper(nums,n+1,count+1,ans);
    //         }
    //        return helper(nums,n+1,1,Math.max(count,ans));

    // //       return ans ;


    // time comlexity=o(n)

    if(nums.length==0){
        return 0;
    }
        HashSet<Integer> map=new HashSet<>();
        for(int num: nums){
            map.add(num);
        }
        int ans=0;
      //  int current=0;
        //int count=1;

        for (int num : map){
                if(!map.contains(num-1)){
                  int  current=num;
                   int  count=1;
                

                while(map.contains(current+1)){
                    current++;
                    count++;
                }
                ans=Math.max(count,ans);
                }
        }
        return ans;
    
    }
}