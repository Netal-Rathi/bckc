class Solution {
    public int maxDepth(String s) {
        int depth=0,temp=0,count=0;
        for(Character c: s.toCharArray()){
            if(c=='('){
                depth++;
               // temp=depth;
            }else if(c==')'){
                depth--;
            }else{
                continue;
            }
            
            
                count=Math.max(count,depth);

            
            
        }
        return count;
        
    }
}
// Title: Maximum Nesting Depth of the Parentheses
