class Solution {
    public int minimumRecolors(String blocks, int k) {
        int max_colour=0;
        
        for(int i=0;i<=blocks.length()-k;i++){
            int count=0;
                for(int j=i;j<i+k;j++){
                    if(blocks.charAt(j)=='B'){
                        count++;
                    }
                }
          
                max_colour=Math.max(count,max_colour);
                System.out.println(max_colour);
                if(max_colour>=k){
                    return 0;
                }
        }
        System.out.println(max_colour);
       // return max_colour<=k ? k-max_colour : 0;
       return k-max_colour;
    }
}