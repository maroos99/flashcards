package pl.msz.flashcards.service;

import pl.msz.flashcards.dto.FlashcardDto;

import java.util.List;

public interface FlashcardService {

    List<FlashcardDto> findAll();

    List<FlashcardDto> findAllByLogin(String login);

    List<FlashcardDto> findByLoginAndListName(String login, String listName);

    FlashcardDto findById(Long id);

    FlashcardDto save(FlashcardDto flashcardDto);

}
