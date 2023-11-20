package socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import socialmedia.model.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer> {

}
