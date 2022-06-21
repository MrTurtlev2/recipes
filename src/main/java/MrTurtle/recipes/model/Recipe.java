package MrTurtle.recipes.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Recipe {
    public Integer id;
    public String name;
    public String type;
    public String country;
}
