class Solution {
    public int romanToInt(String s) {
      //  int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
   //   HashMap <Character,Inteh>
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            int one=isvalid(s.charAt(i));
            int two=isvalid(s.charAt(i+1));
            if(one>=two){
                count+=one;
                System.out.println(count);
                if(i==s.length()-2){
                    count+=two;
                }
            }else{
                count+=two-one;
                 System.out.println(count);
                 i++;
            }

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
