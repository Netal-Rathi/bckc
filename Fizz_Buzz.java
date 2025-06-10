class Solution {
    public List<String> fizzBuzz(int n) {
        int i=1;
        List<String> lis=new ArrayList<>();
        while(i<=n){
        if(i%3==0 && i%5==0){
            lis.add("FizzBuzz");
            i++;
        }else if(i%3==0){
            lis.add("Fizz");
            i++;
        }else if(i%5==0){
            lis.add("Buzz");
            i++;
        }else{
          
            lis.add(    String.valueOf(i));
            i++;
        }
        }
        return lis;
        
    }
}
// Title: Fizz Buzz
