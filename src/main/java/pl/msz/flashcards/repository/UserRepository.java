package pl.msz.flashcards.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.msz.flashcards.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByLoginAndPassword(String login, String password);

}
