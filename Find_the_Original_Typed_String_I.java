class Solution {

    public int possibleStringCount(String word) {
        Character c= word.charAt(0);
        int ans=1,count=0;
        int temp=count;
        int n=word.length();
        for(int i =1;i<n;i++){
            if(word.charAt(i)==c){
                count++;
                // temp=count;
            }else{
                ans+=count;
                count=0;
                c=word.charAt(i);
            }
            // if(count==0){
            //     ans+=temp;
            //     temp=0;
            // }
            

        }


            //     int count=1;
    // HashMap<Character,Integer>  map=new HashMap<>();
    // int n=word.length();
    // for(int i=0;i<n;i++){
    //     map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
    //     }

    //     for(Map.Entry<Character,Integer> entry : map.entrySet()){
    //         if(entry.getValue()>1){
    //             count+=entry.getValue()-1;
    //         }

    //     }
        return ans+count;
    }
}