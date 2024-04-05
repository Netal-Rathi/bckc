class Solution {
    public String makeGood(String s) {
        if(s.isEmpty()){
            return s;
        }
        boolean c=false;
        while(!c){
            c=true;
        for(int i=0;i<s.length()-1;i++){
            char current=s.charAt(i);
            char next=s.charAt(i+1);
            if(Math.abs((current-next))==32){
               s = s.substring(0, i) + s.substring(i + 2);
                c=false;
                break;
            }

            
        }

    
}
return s;
}
}
// Title: Make The String Great
