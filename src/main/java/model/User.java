package model;

/**
 * Created by Xinchen on 5/12/17.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
@Table(name = "users", schema = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
}
