class Solution {
    public String customSortString(String order, String s) {
       
        int q=s.length();
        int o=order.length();
        StringBuilder output=new StringBuilder();
        if(order.equals(s)){
            return order;
        }
        
        for(int i=0;i<o;i++){
            for(int j=0;j<q;j++){
                if(order.charAt(i)==s.charAt(j)){
                    output.append(s.charAt(j));
                    s=s.substring(0,j) + ' ' + s.substring(j+1);
                }else{
                    continue;
                }
            }

        }
        for(int i=0;i<q;i++){
            if(s.charAt(i)!=' '){
                output.append(s.charAt(i));
            }
        }
        return output.toString();
        }

        
    }
