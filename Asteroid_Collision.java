class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int n=asteroids.length;

        for (int a : asteroids ){
            boolean alive =true;
          while(!stack.isEmpty() && a<0 && stack.peek()>0){
            if(Math.abs(a)>stack.peek()){
                stack.pop();
                continue;
            }else if (Math.abs(a)==stack.peek()){
                stack.pop();

            }
             alive=false;
             break;
            
          }
            if(alive){
            stack.push(a);
        }
     
        }
       int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; --i) {
            result[i] = stack.pop();
        }
        
        return result;
    }
    
}
// Title: Asteroid Collision
