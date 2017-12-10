package model;

/**
 * Created by Xinchen on 5/12/17.
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "posts")
public class Post extends BasicEntity implements Serializable{

//    private long topicId;
    private String topic;
    private String message;

    public Post(long topicId){
//        this.topicId = topicId;
    }
}
