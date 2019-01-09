package pl.msz.flashcards.dto;

import pl.msz.flashcards.model.Flashcard;
import pl.msz.flashcards.model.User;

import javax.persistence.*;

public class FlashcardDto {

    private Long id;
    private String word;
    private String wordTranslation;
    private User user;
    private String listName;


    public FlashcardDto() {
    }

    public FlashcardDto(Long id, String word, String wordTranslation, User user, String listName) {
        this.id = id;
        this.word = word;
        this.wordTranslation = wordTranslation;
        this.user = user;
        this.listName = listName;
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

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
