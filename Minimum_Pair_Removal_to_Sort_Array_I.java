class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        if(sorted(list) || list.size()==1 ){
            return 0;
        }
        
        int count=0;
     
        while(list.size()>=2){
           // int min_sum[]=minimum(list);
          int min_sum[]=  minimumsum(list);
                list.set(min_sum[1],min_sum[0]);
            list.remove(min_sum[1]+1);
                count++;
           if(sorted(list)){
               return count;
           }
                  
            }
        return count;
        }
    
    
    public int[] minimumsum(List<Integer> list){
        int start=0,end=1;
        int min_sum[] =new int[2];
     min_sum[0]=list.get(start)+list.get(end);
        min_sum[1]=start;
        int sum=0;
        for( end=2;end<list.size();end++){
            start++;
            sum=list.get(end)+list.get(start);
            if(sum<min_sum[0]){
                    min_sum[0]=sum;
                        min_sum[1]=start;
            }
            
            
        }
        return min_sum;
    }
    
    //sorting
    public boolean sorted(List<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
