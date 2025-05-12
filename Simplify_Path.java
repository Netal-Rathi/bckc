class Solution {
    public String simplifyPath(String path) {
        // . --> ignore, ""--> ignore
        // (..) pop
        //...--> push 
        String components [] =path.split("/");
        Stack<String> s1=new Stack<>();
        for(String comp : components){
            if(comp.equals(".") || comp.equals("")){
                continue ;
            }

            if(comp.equals("..")){
                if(!s1.isEmpty()){
                    s1.pop();
                }

            }else{
                s1.push(comp);
            }

        }
        StringBuilder ans=new StringBuilder ();
        while(!s1.isEmpty()){
         //   ans.append("/" + s1.pop());
         ans.insert(0,"/" + s1.pop());

        }
        return ans.length()==0? "/" : ans.toString();
        
    }
}