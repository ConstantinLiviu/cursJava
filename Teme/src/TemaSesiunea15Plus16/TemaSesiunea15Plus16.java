package TemaSesiunea15Plus16;

import java.util.ArrayList;
import java.util.List;

public class TemaSesiunea15Plus16 {
    public static void main(String[] args) {
        // Design a recipe book where you can add recipes, and search for recipes based on ingredients.
        // create recipe book as an ArrayList
         List<Recipe> recipesWithMilk = new ArrayList<>();

         // instantiate objects
        Recipe orezCuLapte = new Recipe("Orez cu lapte", "lapte", "carne", "oua");
        Recipe tartaCuVisine = new Recipe("Tarta cu visine", "apa", "faina", "visine", "zahar");

        // use class method to add recipes to recipe book (array list)
        orezCuLapte.addRecipe(recipesWithMilk);
        tartaCuVisine.addRecipe(recipesWithMilk);

        // look up recipes that have milk as an ingredient
        for(Recipe recipe: recipesWithMilk) {
            if(recipe.hasIngredients("lapte")) {
                System.out.println(recipe.getName());
            }
        }



    }
}
