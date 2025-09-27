package chzhao.ie.foodie.Models;

import java.util.List;

public class Dish {
    private String name;
    private String description;
    private List<String> ingredients;
    private Recipe recipe;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }

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
}
