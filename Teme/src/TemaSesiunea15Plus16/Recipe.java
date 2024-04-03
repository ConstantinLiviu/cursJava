package TemaSesiunea15Plus16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients;

    Recipe(String name, String ...ingredients) {
        this.name = name;
        this.ingredients = new ArrayList<String>(Arrays.asList(ingredients));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean hasIngredients(String ingredientParam) {
        return ingredients.contains(ingredientParam);
    }

    void addRecipe(List<Recipe> listParam) {
        listParam.add(this);
    }

}