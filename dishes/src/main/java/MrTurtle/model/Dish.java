package MrTurtle.model;

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
public class Dish {
    @Id
    public int id;

    @Column
    public String name;

    public Dish(String name){
        this.name = name;
    }
}
