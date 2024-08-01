class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for (String i : details){
            int ans=Integer.parseInt(i.substring(11,13));
            if(ans>60){
                count++;
            }
            ans=0;
        }
        return count;
    }
}