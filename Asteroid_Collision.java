class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int n=asteroids.length;

        for (int a : asteroids ){
            if(a>0){
                stack.push(a);
            }else if ( stack.isEmpty() || stack.peek()<0 ){
                stack.push(a);
            }else {
                if(Math.abs(a)>=stack.peek()){
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