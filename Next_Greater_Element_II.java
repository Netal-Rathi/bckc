class Solution {
   public int popfrombottom(Stack<Integer> s1){
    int top = s1.pop();
    if (s1.isEmpty()) {
        return top;  // ✅ base case: bottom element
    }
    int bottom = popfrombottom(s1);
    s1.push(top);   // ✅ restore the stack after recursion
  return bottom;
}

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
    int bottom=popfrombottom(stack);
    while( !stack.isEmpty() && bottom>stack.peek()){
        map.put(stack.pop(),bottom);
    }
    map.put(bottom,-1);
}
    //    while(!stack.isEmpty()){
    //     int top=stack.pop();
    //     if(stack.isEmpty()){
    //         map.put(top,-1);

    //     }else{
    //         map.put(top,stack.peek());
    //     }
    //    }
     
  int arr[]=new int [nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i]=map.get(nums[i]);
       }
       return arr;

   
       }



    }
