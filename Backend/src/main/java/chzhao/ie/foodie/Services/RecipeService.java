package chzhao.ie.foodie.Services;

import chzhao.ie.foodie.Models.Recipe;
import chzhao.ie.foodie.Repos.RecipeRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    public Recipe getRecipeById(String id) {
        return recipeRepository.findById(id).orElse(null);
    }
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
