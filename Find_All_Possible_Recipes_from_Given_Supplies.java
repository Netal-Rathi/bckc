import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> answers = new ArrayList<>();
        List<String> supplyList = new ArrayList<>(Arrays.asList(supplies)); 

        for (int i = 0; i < ingredients.size(); i++) {
            boolean isValid = true; 
            
            for (String s : ingredients.get(i)) {
                if (!supplyList.contains(s)) {  
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                supplyList.add(recipes[i]);  
                answers.add(recipes[i]);  
            }
        }
        return answers;
    }
}

// Title: Find All Possible Recipes from Given Supplies
