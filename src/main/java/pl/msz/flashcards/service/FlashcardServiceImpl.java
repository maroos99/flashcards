package pl.msz.flashcards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.msz.flashcards.converter.FlashcardConverter;
import pl.msz.flashcards.dto.FlashcardDto;
import pl.msz.flashcards.model.Flashcard;
import pl.msz.flashcards.repository.FlashcardRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlashcardServiceImpl implements FlashcardService{

    @Autowired
    private FlashcardRepository flashcardRepository;

    @Autowired
    private FlashcardConverter flashcardConverter;

    @Override
    public List<FlashcardDto> findAll() {
        List<FlashcardDto> flashcardsDto = new ArrayList<>();
        Iterable<Flashcard> flashcards = flashcardRepository.findAll();

        for(Flashcard  flashcard : flashcards) {
            flashcardsDto.add(flashcardConverter.convert(flashcard));
        }

        return flashcardsDto;
    }
}
