package MrTurtle.controller;

import MrTurtle.model.Recipe;
import MrTurtle.repository.RecipeRepository;
import MrTurtle.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/recipes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private RecipeService recipeService;

    @GetMapping(path = "/all")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Recipe getRecipeById(@PathVariable("id") int id) {
        return  recipeRepository.getReferenceById(id);
    }
    @PostMapping(path = "/add")
    public int createRecipe(@RequestBody Recipe recipe){
        return recipeService.createNewRecipe(recipe);
    }
    @PutMapping(path = "/update")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return recipeRepository.save(recipe);
    }

}
