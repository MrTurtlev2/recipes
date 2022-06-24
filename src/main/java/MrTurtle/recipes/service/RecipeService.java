package MrTurtle.recipes.service;
import MrTurtle.recipes.model.Recipe;
import MrTurtle.recipes.model.Dish;
import MrTurtle.recipes.model.Country;
import MrTurtle.recipes.repository.CountryRepository;
import MrTurtle.recipes.repository.DishRepository;
import MrTurtle.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private DishRepository dishRepository;

    public int createNewRecipe (Recipe recipe){
        if(countryRepository.findCountryByName(recipe.getName()) == null){
            countryRepository.save(new Country(recipe.getCountry()));
        }
        if(dishRepository.findDishByName(recipe.getType()) == null){
            dishRepository.save(new Dish(recipe.getType()));
        }
        return recipeRepository.save(recipe).getId();
    }
}
