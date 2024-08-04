class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> ans=new HashMap<>();
        for (String s: arr){
            ans.put(s,ans.getOrDefault(s,0)+1);

        }
        int i=0;
        for (String s : arr){
            if(ans.get(s)==1){
                i++;

            }
            if(i==k){
                return s;
            }
        }
      

        return "";


        
    }
}
// Title: Kth Distinct String in an Array
