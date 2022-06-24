package MrTurtle.recipes.repository;

import MrTurtle.recipes.model.Country;
import MrTurtle.recipes.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findCountryByName(String name);
}
