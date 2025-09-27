package chzhao.ie.foodie.Repos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import chzhao.ie.foodie.Models.Recipe;
import java.util.List;
@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
    // Add custom queries later if needed
}
