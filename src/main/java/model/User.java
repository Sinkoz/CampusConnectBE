package model;

/**
 * Created by Xinchen on 5/12/17.
 */

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User extends BasicEntity implements Serializable {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
