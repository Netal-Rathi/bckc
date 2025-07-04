class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        int maxi=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()==entry.getValue()){
                maxi=Math.max(maxi,entry.getKey());
            }
        }
        return maxi;
        
    }
}
// Title: Find Lucky Integer in an Array
