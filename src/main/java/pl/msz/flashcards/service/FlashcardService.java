package pl.msz.flashcards.service;

import pl.msz.flashcards.dto.FlashcardDto;

import java.util.List;

public interface FlashcardService {

    List<FlashcardDto> findAll();
}
