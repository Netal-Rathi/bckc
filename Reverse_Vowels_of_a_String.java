class Solution {
    public String reverseVowels(String s) {
        int j = s.length()-1 , i = 0;
        char [] arr=s.toCharArray();

        while (i < j) {
 
                while(i< j && !isvowel(arr[i])){
                    i++;
                }

                 while(i< j && !isvowel(arr[j])){
                    j--;
                }

                char temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;

        }
        return new String(arr);
    }
    public boolean isvowel(char c){
       return "AEIOUaeiou".indexOf(c) != -1 ;
    }

}