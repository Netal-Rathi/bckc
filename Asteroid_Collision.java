class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int n=asteroids.length;

        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }else{
          while(!stack.isEmpty() && Math.abs(asteroids[i])>=stack.peek() ){
            //if( Math.abs(asteroids[i])>=stack.peek()){
            stack.pop();
            
          }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());

        }
        Collections.reverse(list);
        int [] ans= list.stream().mapToInt(Integer :: intValue).toArray();
        return ans  ;
    }
    
}