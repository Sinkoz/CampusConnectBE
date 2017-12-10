package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Xinchen on 9/12/17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "tags")
public class Tag extends BasicEntity implements Serializable{

    private String tagName="";

    public Tag(String tagName){
        this.tagName = tagName;
    }
}
