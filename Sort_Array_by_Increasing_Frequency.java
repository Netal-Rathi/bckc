class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

     Integer[] result =Arrays.stream(nums).boxed().toArray(Integer[]::new);

     Arrays.sort(result,(a,b)->{
        int freqa=map.get(a);
        int freqb=map.get(b);
        if(freqa!=freqb){
            return freqa-freqb;
        }else{
            return  b-a;
        }
     });
     return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
     


        
    }
}