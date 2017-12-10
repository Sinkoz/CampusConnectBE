package Repositories;

/**
 * Created by Xinchen on 5/12/17.
 */

import model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post,String> {
//    List<Post> findAll();
}