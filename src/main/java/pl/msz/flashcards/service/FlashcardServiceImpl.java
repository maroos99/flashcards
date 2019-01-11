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

    @Override
    public List<FlashcardDto> findAllByLogin(String login) {
        List<FlashcardDto> flashcardsByLoginDto = new ArrayList<>();
        Iterable<Flashcard> flashcardsByLogin = flashcardRepository.findAllByLogin(login);

        for(Flashcard flashcard : flashcardsByLogin){
            flashcardsByLoginDto.add(flashcardConverter.convert(flashcard));
        }

        return flashcardsByLoginDto;
    }

    @Override
    public List<FlashcardDto> findByLoginAndListName(String login, String listName) {
        List<FlashcardDto> flashcardSets = new ArrayList<>();
        Iterable<Flashcard> flashcardsByLoginAndListName = flashcardRepository.findByLoginAndListName(login, listName);

        for(Flashcard flashcard : flashcardsByLoginAndListName){
            flashcardSets.add(flashcardConverter.convert(flashcard));
        }

        return flashcardSets;
    }

    @Override
    public FlashcardDto findById(Long id) {
        return flashcardConverter.convert(flashcardRepository.findById(id).get());
    }

    //service nie powinien zwracac encji
    @Override
    public FlashcardDto save(FlashcardDto flashcardDto) {
        Flashcard flashcardToSave = flashcardConverter.convertFlashcardDto(flashcardDto);
        flashcardToSave=flashcardRepository.save(flashcardToSave);
        return flashcardConverter.convert(flashcardToSave);
    }
}
