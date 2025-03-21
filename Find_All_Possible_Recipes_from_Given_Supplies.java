class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
     List<String> supplyList = new ArrayList<>(Arrays.asList(supplies));
List<String> answers=new ArrayList<>();
boolean isvalid=true;
int i=0;
        for(List<String> ing: ingredients){
            for(String s: ing){
                if(!supplyList.contains(s)){
                       
                        isvalid=false;
                         break;
                }
            }
            if(isvalid){
                supplyList.add(recipes[i]);
                answers.add(recipes[i]);
            }
            i++;

        }
        return answers;
        
    }
}