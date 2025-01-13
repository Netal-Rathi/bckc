class Solution {
    public int romanToInt(String s) {
      //  int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
   //   HashMap <Character,Inteh>
   if(s.length()==1){
    return isvalid(s.charAt(0));
   }
        int count=0, m=0;
        for(int i=0;i<s.length()-1;i++){
            int one=isvalid(s.charAt(i));
            int two=isvalid(s.charAt(i+1));
            if(one>=two){
                count+=one;
                System.out.println(count);
                
            }else{
                count+=two-one;
                 System.out.println(count);
                 i++;
            }
            m=i;

        }
        if(m==s.length()-2){
        count+=isvalid(s.charAt(s.length()-1));
        }
        return count;
       
        
    }

    public int isvalid(Character c){
        int count=0;
        switch(c){
                case 'M' : count=1000;
                break;
                case 'D': count=500;
                break;
                    case 'C': count=100;
                break;
                case 'L' : count=50;
                break;
                    case 'X' : count=10;
                break;
                case 'V' : count=5;
                break;
                    case 'I' : count=1;
                break;
               

            }
            return count;
    }
}
// Title: Roman to Integer
