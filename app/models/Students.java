package models;

import io.ebean.Model;
import io.ebean.annotation.Identity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Students extends Model {
    @Id
    @Identity
    public Long id;

    public String name;
    public String indexNumber;
}
