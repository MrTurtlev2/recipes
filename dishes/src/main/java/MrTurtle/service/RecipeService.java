package MrTurtle.service;
import MrTurtle.model.Country;
import MrTurtle.model.Dish;
import MrTurtle.model.Recipe;
import MrTurtle.repository.CountryRepository;
import MrTurtle.repository.DishRepository;
import MrTurtle.repository.RecipeRepository;
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
        System.out.println(recipe);
        if(countryRepository.findCountryByName(recipe.getCountry().getName()) == null){
            countryRepository.save(new Country(recipe.getCountry().getName()));
            System.out.println(recipe.getCountry().getName());
        }
        if(dishRepository.findDishByName(recipe.getType().getName()) == null){
            dishRepository.save(new Dish(recipe.getType().getName()));
            System.out.println(recipe.getType().getName());
        }
        return recipeRepository.save(recipe).getId();
    }
}
