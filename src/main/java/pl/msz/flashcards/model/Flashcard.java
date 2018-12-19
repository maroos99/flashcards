package pl.msz.flashcards.model;


import javax.persistence.*;

@Entity
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;

    @Column(name = "word_translation")
    private String wordTranslation;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Flashcard() {
    }

    public Flashcard(String word, String wordTranslation, User user) {
        this.word = word;
        this.wordTranslation = wordTranslation;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordTranslation() {
        return wordTranslation;
    }

    public void setWordTranslation(String wordTranslation) {
        this.wordTranslation = wordTranslation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
