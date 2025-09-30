package chzhao.ie.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chzhao.ie.foodie.Services.DishService;
import chzhao.ie.foodie.Models.Dish;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dishes")
public class DishController {
    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/getAll")
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }

    @GetMapping("/get/{name}")
    public Optional<Dish> getDishByName(@PathVariable String name) {
        return dishService.getDishByName(name);
    }

    @PostMapping("/create")
    public Dish createDish(@RequestBody Dish dish) {
        return dishService.createDish(dish);
    }
}
