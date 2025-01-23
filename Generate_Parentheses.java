class Solution {
    public List<String> generateParenthesis(int n) {
        int closed=0,open=0;
        List<String> ans=new ArrayList<>();
        return generate(n,closed,open,"",ans);
    }
    // n==> length
    //m=> character array ki length
    // k=closed brackets how much
    public List<String> generate (int n,int closed,int open,String current,List<String> ans){
        if(current.length()==2*n){
            ans.add(current);
        }
        if(open<n){
            generate(n,closed,open+1,current+"(",ans);
        }
        if(closed<open){
             generate(n,closed+1,open,current + ")",ans);
        }
        return ans;
    }

 
}
// Title: Generate Parentheses
