class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

            List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
                StringBuilder s1=new StringBuilder();
            for(Map.Entry<Character,Integer> entry : list){
                for(int i=0;i<entry.getValue();i++){
                    s1.append(entry.getKey());
                }

            }

            return s1.toString();
        
    }
}