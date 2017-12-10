package model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Xinchen on 9/12/17.
 */
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String id;

//    @CreatedDate
//    protected Date createTime;
//
//    @LastModifiedDate
//    protected Date updateTime;
}
