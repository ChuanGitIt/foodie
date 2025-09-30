package chzhao.ie.foodie.Repos;

import org.springframework.stereotype.Repository;
import chzhao.ie.foodie.Models.Dish;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DishRepository extends MongoRepository<Dish, String> {
    Optional<Dish> findByNameIgnoreCase(String name);
}

