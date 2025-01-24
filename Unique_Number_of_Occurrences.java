class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> ans=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int val:map.values()){
            if(ans.containsKey(val)){
                  return false;
                
            }else{
                ans.put(val,0);
            }
        }
        return true;
        
    }
}