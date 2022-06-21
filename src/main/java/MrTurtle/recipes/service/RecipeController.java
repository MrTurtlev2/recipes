package MrTurtle.recipes.service;

import MrTurtle.recipes.model.Recipe;
import MrTurtle.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping(path = "/all")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    @GetMapping(path = "/id/{id}")
    public Recipe getRecipeById(@PathVariable("id") int id) {
        return  recipeRepository.getReferenceById(id);
    }

}
