package chzhao.ie.foodie.Models;

import java.util.List;

import org.springframework.data.annotation.Id;


public class Recipe {

    private int steps;
    private List<String> instructions;
    private String imageUrl;
    private int cookingTime;


    public Recipe(int steps, List<String> instructions, String imageUrl, int cookingTime) {
        this.steps = steps;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
        this.cookingTime = cookingTime;
    }

    // getters and setters

    public int getSteps() { return steps; }
    //public void setSteps(int steps) { this.steps = steps; }

    public List<String> getInstructions() { return instructions; }
    //public void setInstructions(List<String> instructions) { this.instructions = instructions; }

    public String getImageUrl() { return imageUrl; }
    //public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getCookingTime() { return cookingTime; }
    //public void setCookingTime(int cookingTime) { this.cookingTime = cookingTime; }
    
}
