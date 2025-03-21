class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
     List<String> supplyList = new ArrayList<>(Arrays.asList(supplies));
List<String> answers=new ArrayList<>();


   for (int i=0;i<recipes.length;i++){
    boolean isvalid=true;
            for(String s: ingredients.get(i)){
                if(!supplyList.contains(s)){
                       
                        isvalid=false;
                         break;
                }
            }
            if(isvalid){
                supplyList.add(recipes[i]);
                answers.add(recipes[i]);
            }
           // i++;

        }
        return answers;
        
    }
}
// Title: Find All Possible Recipes from Given Supplies
