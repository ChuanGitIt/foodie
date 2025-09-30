package chzhao.ie.foodie.Services;

import org.springframework.stereotype.Service;
import chzhao.ie.foodie.Models.*;
import chzhao.ie.foodie.Repos.DishRepository;
import java.util.List;
import java.util.Optional;

@Service
public class DishService {
    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
    public Dish getDishById(String id) {
        return dishRepository.findById(id).orElse(null);
    }
    public Dish createDish(Dish dish) {
        Optional<Dish> existingDish = dishRepository.findByNameIgnoreCase(dish.getName());
        if (existingDish.isPresent()) {
            throw new IllegalArgumentException("Dish with name '" + dish.getName() + "' already exists.");
        }
        return dishRepository.save(dish);
}
    public Optional<Dish> getDishByName(String name) {
        return dishRepository.findByNameIgnoreCase(name);
    }
}
