package chzhao.ie.foodie.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Recipes") // MongoDB collection name in Foods database
public class Recipe {

    @Id
    private String id;  // MongoDB will assign an _id automatically

    private int steps;
    private List<String> instructions;
    private String imageUrl;
    private int cookingTime;

    public Recipe() {}// Default constructor for MongoDB

    public Recipe(int steps, List<String> instructions, String imageUrl, int cookingTime) {
        this.steps = steps;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
        this.cookingTime = cookingTime;
    }

    // getters and setters
    public String getId() { return id; }
    //public void setId(String id) { this.id = id; }

    public int getSteps() { return steps; }
    //public void setSteps(int steps) { this.steps = steps; }

    public List<String> getInstructions() { return instructions; }
    //public void setInstructions(List<String> instructions) { this.instructions = instructions; }

    public String getImageUrl() { return imageUrl; }
    //public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getCookingTime() { return cookingTime; }
    //public void setCookingTime(int cookingTime) { this.cookingTime = cookingTime; }
    
}
