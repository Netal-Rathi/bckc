class Solution {
    public int minimizeXor(int num1, int num2) {
      int count1=  Integer.bitCount(num1);
      int count2=Integer.bitCount(num2);
        if(count1==count2){
            return num1;
        }
        StringBuilder  s= new StringBuilder(Integer.toBinaryString(num1));
        //reduce no of once==> count2-coun1 
       // int i=0;
        if(count1>count2){
            int toremove=count1-count2;
            for(int i=0 ; i<s.length() && toremove>0 ;i++){
                if(s.charAt(i)=='1'){
                    s.setCharAt(i,'0');
                    toremove--;
                }
            }

        }else{
            int toadd=count2-count1;
           for(int i=s.length()-1;i>=0 && toadd>0 ;i--){
            if(s.charAt(i)=='0'){
                s.setCharAt(i,'1');
                toadd--;
            }
           }
           while(toadd>0){
            s.insert(0,'1');
            toadd--;
           }
        
        }

      return Integer.parseInt(s.toString(),2);
        
    }
}