class Solution {
    HashMap<String ,Integer> map=new HashMap<>();
    
    public String findCommonResponse(List<List<String>> responses) {
        int count=0;
        String fa="";
   //     HashMap<String,Integer> mainmap=new HashMap<>();
       for(List<String> s: responses){
           finder(s);
       }
          for(Map.Entry<String,Integer> entry : map.entrySet()){
          // count=Math.max(count,entry.getKey());
              if(count<entry.getValue()){
                  count=entry.getValue();
                  fa=entry.getKey();
              }else{
                  if(count==entry.getValue()){
                      if(fa.compareTo(entry.getKey())>0){
                          fa=entry.getKey();
                      }
                      
                  }
              }
        }
        return fa; 
        
        
    }
    
    public List<String> finder(List<String> li){
        List<String> ans=new ArrayList<>();
        for(String l: li){
           // map.put(l,map.getOrDefault(l,0)+1);
            if(!ans.contains(l)){
                ans.add(l);
                map.put(l,map.getOrDefault(l,0)+1);
                
            }
            
        }
       
        return ans;
        
    }
}