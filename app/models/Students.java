package models;

import io.ebean.Model;
import jakarta.persistence.*;

@Entity
public class Students extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String indexNumber;

    public Students(String name, String indexNumber){
        this.name = name;
        this.indexNumber = indexNumber;
    }
}
