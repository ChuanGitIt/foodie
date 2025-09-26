package chzhao.ie.foodie.Models;

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
    
}
