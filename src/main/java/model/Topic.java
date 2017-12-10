package model;

/**
 * Created by Xinchen on 5/12/17.
 */

import com.sun.tools.javac.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "topics")
public class Topic extends BasicEntity implements Serializable{

    private String name;
    private String description;

    public Topic(String name){
        this.name = name;
    }
}
