package socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import socialmedia.model.Post;

@EnableJpaRepositories
public interface PostRepository extends JpaRepository<Post,Integer> {

}
