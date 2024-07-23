import java.util.*;
public class Solution {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        findpermutations(nums,new ArrayList<>(), result);
        return result;


    }

    public void findpermutations(int[] nums,List<Integer>current ,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<> (current));
            return;

        }
        for(int i=0;i<nums.length;i++){
            if(!current.contains(nums[i])){
                current.add(nums[i]);

               findpermutations(nums,current,result);
               current.remove(current.size()-1);
            }
        }
    }
    
}

// Title: Permutations
