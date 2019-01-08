package pl.msz.flashcards.converter;

import pl.msz.flashcards.dto.FlashcardDto;
import pl.msz.flashcards.model.Flashcard;

public interface FlashcardConverter {

    FlashcardDto convert(Flashcard flashcard);
}
