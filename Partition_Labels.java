class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           Character ind=s.charAt(i);
           map.putIfAbsent(ind,new ArrayList<>());
           map.get(ind).add(i);
        }
        int i=0;
        while(i!=s.length()){
            HashSet <Character> set=new HashSet<>();
            int start =map.get(s.charAt(i)).get(0);
            int end =map.get(s.charAt(i)).get(map.get(s.charAt(i)).size()-1);
            for(int j=start;j<=end;j++){
                    Character ind=s.charAt(j);
                set.add(ind);

                if(map.get(ind).get(map.get(ind).size()-1)>end){
                    end=map.get(ind).get(map.get(ind).size()-1);
                }
            }
            ans.add(end-start+1);
           
            i=end+1;
           

            
        }
        return ans;
    }
}