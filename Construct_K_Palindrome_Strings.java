class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k){
            return true;
        }
         HashMap<Character,Integer> map=new HashMap<>();
        int evencount=0,oddcount=0;

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
        System.out.println("even" + evencount);
        System.out.println("odd " + oddcount);
    if(k<=evencount && k>=oddcount%2){
        return true ;
    }else{
        return false;
    }

}
}