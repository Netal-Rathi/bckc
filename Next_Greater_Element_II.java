class Solution {
    public int[] nextGreaterElements(int[] nums) {
              HashMap<Integer,Integer> map=new HashMap<>();
       Stack<Integer> stack=new Stack<>();
       for(int num : nums){
        while(!stack.isEmpty() && num>stack.peek()){
            map.put(stack.pop(),num);

        }
        stack.push(num);
       }

       while(!stack.isEmpty()){
        int top=stack.pop();
        if(stack.isEmpty()){
            map.put(top,-1);

        }else{
            map.put(top,stack.peek());
        }
       }
  int arr[]=new int [nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i]=map.get(nums[i]);
       }
       return arr;
       }



    }
