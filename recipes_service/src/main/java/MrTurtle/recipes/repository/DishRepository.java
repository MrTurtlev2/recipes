package MrTurtle.recipes.repository;

import MrTurtle.recipes.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
    Dish findDishByName(String name);
}
