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
public class Country implements Serializable {
    @Id
    public int id;

    @Column
    public String name;

    public Country(String name){
        this.name = name;
    }
}
