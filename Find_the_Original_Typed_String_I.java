class Solution {

    public int possibleStringCount(String word) {
        int count=1;
    HashMap<Character,Integer>  map=new HashMap<>();
    int n=word.length();
    for(int i=0;i<n;i++){
        map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                count+=entry.getValue()-1;
            }

        }
        return count;
    }
}
// Title: Find the Original Typed String I
