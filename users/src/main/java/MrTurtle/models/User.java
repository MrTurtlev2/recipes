package MrTurtle.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "\"User\"")
@NoArgsConstructor
@Getter
@Setter
public class User implements Serializable {
    @Id
    private int id;
    @Column
    public String name;
    @Column
    public String password;
    @Column
    public int age;
}
