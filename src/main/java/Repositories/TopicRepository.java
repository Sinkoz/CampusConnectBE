package Repositories;

/**
 * Created by Xinchen on 5/12/17.
 */

import model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicRepository extends CrudRepository<Topic,Long> {

}
