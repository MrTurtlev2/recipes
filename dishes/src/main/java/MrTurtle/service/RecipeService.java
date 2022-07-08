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
        Dish type = updateDish(recipe.getType().getName());
        Country country = updateCountry(recipe.getCountry().getName());

        return recipeRepository.save(
                new Recipe(recipe.getName(),
                        type,
                        country)
        ).getId();
    }

    public Recipe updateRecipe(int id, Recipe recipe) {
        Recipe recipeToUpdate = recipeRepository.getReferenceById(id);
        if(!recipe.name.equals(recipeToUpdate.name)){
            recipeToUpdate.setName(recipe.name);
        }
        recipeToUpdate.setType(updateDish(recipe.getType().getName()));
        recipeToUpdate.setCountry(updateCountry(recipe.getCountry().getName()));
        return recipeRepository.save(recipeToUpdate);
    }

    public Country updateCountry(String countryName){
        Country country = countryRepository.findCountryByName(countryName);
        if(country == null){
            country = countryRepository.save(new Country(countryName));
        }
        return country;
    }

    public Dish updateDish(String dishName){
        Dish dish = dishRepository.findDishByName(dishName);
        if (dish == null){
            dish = dishRepository.save(new Dish(dishName));
        }
        return dish;
    }
}
