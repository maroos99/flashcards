package pl.msz.flashcards.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.msz.flashcards.model.Flashcard;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlashcardRepository extends CrudRepository<Flashcard, Long> {

       @Query("SELECT f FROM Flashcard f WHERE f.user.login = :login")
       List<Flashcard> findAllByLogin(@Param("login") String login);

       @Query("SELECT f FROM Flashcard f WHERE f.user.login = :login AND f.listName = :listName")
       List<Flashcard> findByLoginAndListName(@Param("login") String login, @Param("listName") String listName);

       @Query("SELECT MIN(f.id) FROM Flashcard f WHERE f.user.login = :login AND f.listName = :listName")
       Long findMinIdFlashcardByUserAndListName(@Param("login") String login, @Param("listName") String listName);

       @Query("SELECT MIN(f.id) FROM Flashcard f WHERE f.user.login = :login AND f.listName = :listName AND f.id> :currentFlashcardId " +
               "AND status = false")
       Long findNextIdFlashcardByUserAndListName(@Param("login") String login, @Param("listName") String listName,
                                                 @Param("currentFlashcardId") Long currentFlashcardId);

       @Query("SELECT MAX(f.id) FROM Flashcard f WHERE f.user.login = :login AND f.listName = :listName AND f.id< :previousFlashcardId " +
               "AND status = false")
       Long findPreviousIdFlashcardByUserAndListName(@Param("login") String login, @Param("listName") String listName,
                                                 @Param("previousFlashcardId") Long previousFlashcardId);
}