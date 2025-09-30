package chzhao.ie.foodie.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dish") // MongoDB collection name in Foods database
public class Dish {

    @Id
    private String id;  // MongoDB will assign an _id automatically
        
    private String name;
    private String description;
    private List<String> ingredients;
    private Recipe recipe;

    public Dish(String name, String description, List<String> ingredients, Recipe recipe) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public Dish() {} // Default constructor for MongoDB

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
