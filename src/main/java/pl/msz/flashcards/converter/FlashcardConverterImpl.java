package pl.msz.flashcards.converter;

import org.springframework.stereotype.Component;
import pl.msz.flashcards.dto.FlashcardDto;
import pl.msz.flashcards.model.Flashcard;

@Component
public class FlashcardConverterImpl implements FlashcardConverter {
    @Override
    public FlashcardDto convert(Flashcard flashcard) {
        FlashcardDto flashcardDto = new FlashcardDto();
        flashcardDto.setId(flashcard.getId());
        flashcardDto.setUser(flashcard.getUser());
        flashcardDto.setWord(flashcard.getWord());
        flashcardDto.setWordTranslation(flashcard.getWordTranslation());
        flashcardDto.setListName(flashcard.getListName());
        flashcardDto.setLearned(flashcard.isLearned());

        return flashcardDto;
    }

    @Override
    public Flashcard convertFlashcardDto(FlashcardDto flashcardDto) {
        Flashcard flashcard = new Flashcard();
        flashcard.setId(flashcard.getId());
        flashcard.setUser(flashcard.getUser());
        flashcard.setWord(flashcard.getWord());
        flashcard.setWordTranslation(flashcard.getWordTranslation());
        flashcard.setListName(flashcard.getListName());
        flashcard.setLearned(flashcard.isLearned());

        return flashcard;
    }
}
