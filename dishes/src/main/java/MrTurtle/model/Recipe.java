package MrTurtle.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recipe")
@NoArgsConstructor
@Getter
@Setter
public class Recipe implements Serializable {
    @Id
    public Integer id;

    public String name;

    @ManyToOne(targetEntity = Dish.class)
    @JoinColumn(name = "type", referencedColumnName = "name")
    public Dish type;

    @ManyToOne(targetEntity = Country.class)
    @JoinColumn(name = "country", referencedColumnName = "name")
    public Country country;
}
