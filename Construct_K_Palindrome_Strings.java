class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k){
            return true;
            
        }

        if(s.length()<k){
            return false;
        }
         HashMap<Character,Integer> map=new HashMap<>();
        int evencount=0,oddcount=0,even=0,odd=0;

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

    }
    for(char c:s.toCharArray()){
        if(map.get(c) %2==0){
            evencount++;
        }else{
            oddcount++;
        }
    }
  for (Integer frequency : map.values()) {
            if (frequency % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    
        System.out.println("evencount :" + evencount + "  even_no :" + even);
        System.out.println("odd :" + oddcount + "  odd_no: " + odd);
        
         if(evencount==0 && odd<=k){
            return true;
        }else if (evencount>0  &&  k>=odd){
            return true;
        }else{
            return false;
        }


    

}
}