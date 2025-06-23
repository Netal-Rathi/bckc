class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
int count=0;
        int i=0;
        for(int j : s){
            if(i<g.length && j>=g[i]){
                i++;
                count++;
            }else{
                //break;
                continue;
            }
        }
        return count;
    }
}
// Title: Assign Cookies
