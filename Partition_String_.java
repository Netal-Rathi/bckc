class Solution {
    public List<String> partitionString(String s) {
         Set<String> seen=new HashSet<>();
         List<String> list=new ArrayList<>();
        int n=s.length();
        
        int i=0;
        StringBuilder sub=new StringBuilder();
        while(i<n){
            sub.append(s.charAt(i));
            if(!seen.contains(sub.toString())){
                list.add(sub.toString());
                 seen.add(sub.toString());
                i++;
                sub.setLength(0);
                
            }else{
                i++;
            }
        }
        return list;
        
    }
}
// Title: Partition String 
