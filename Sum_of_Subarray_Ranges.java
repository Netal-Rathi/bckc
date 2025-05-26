class Solution {
    public long subArrayRanges(int[] nums) {
       long sum1=minimum(nums);
       long sum2=maximum(nums);
       return sum2-sum1;

        
    }
        public long minimum(int [] nums){
             int n=nums.length;
             int[] left =new int [n];
             int [] right =new int [n];
             Arrays.fill(left,-1);
             Arrays.fill(right,n);

             Stack<Integer> stack=new Stack<>();
             for(int i=0;i<n;i++){
                while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                        left[i]=stack.peek();
                }
                stack.push(i);
             }
             stack.clear();

              for(int i=n-1;i>=0;i--){
                while(!stack.isEmpty() && nums[i]<=nums[stack.peek()]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                        right[i]=stack.peek();
                }
               stack.push(i);
             }
                    long sum=0;
             for(int i=0;i<n;i++){
                sum+=((i-left[i])*(right[i]-i)*nums[i]);
             }
             System.out.println(Arrays.toString(left));
              System.out.println(Arrays.toString(right));
             System.out.println(sum);
             return sum;
        }



              public long maximum(int [] nums){
             int n=nums.length;
             int[] left =new int [n];
             int [] right =new int [n];
             Arrays.fill(left,-1);
             Arrays.fill(right,n);

             Stack<Integer> stack=new Stack<>();
             for(int i=0;i<n;i++){
                while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                        left[i]=stack.peek();
                }
                stack.push(i);
             }
             stack.clear();

              for(int i=n-1;i>=0;i--){
                while(!stack.isEmpty() && nums[i]>=nums[stack.peek()]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                        right[i]=stack.peek();
                }
               stack.push(i);
             }
                    long sum=0;
             for(int i=0;i<n;i++){
                sum+=((i-left[i])*(right[i]-i))*nums[i];
             }
            
                 System.out.println(Arrays.toString(left));
              System.out.println(Arrays.toString(right));
               System.out.println(sum);
             return sum;
        }
}
// Title: Sum of Subarray Ranges
