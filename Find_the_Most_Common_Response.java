import java.util.*;

class Solution {
    HashMap<String, Integer> map = new HashMap<>();

    public String findCommonResponse(List<List<String>> responses) {
        for (List<String> response : responses) {
            Set<String> uniqueWords = new HashSet<>();
            for (String word : response) {
                if (uniqueWords.add(word)) { // add() returns false if already exists
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        String fa = "";
        int count = 0;

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
}
