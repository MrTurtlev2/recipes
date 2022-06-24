package MrTurtle.recipes.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Recipe implements Serializable {
    @Id
    public Integer id;
    @Column
    public String name;
    @Column
    public String type;
    @Column
    public String country;
}
