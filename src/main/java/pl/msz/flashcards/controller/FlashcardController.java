package pl.msz.flashcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.msz.flashcards.dto.FlashcardDto;
import pl.msz.flashcards.model.Flashcard;
import pl.msz.flashcards.repository.FlashcardRepository;
import pl.msz.flashcards.service.FlashcardService;

import java.util.*;

@Controller
public class FlashcardController {

    @Autowired
    private FlashcardService flashcardService;

    @Autowired
    private FlashcardRepository flashcardRepository;


    @GetMapping("/all-flashcards")
    public String allFlashcards(Map<String, Object> model){
        model.put("flashcards", flashcardService.findAll());
        return "all-flashcards";
    }

    @GetMapping("/user-flashcards")
    public String allUserFlashcards(Map<String, Object> model, Authentication authentication){
        String login = authentication.getName();
        model.put("flashcards", flashcardService.findAllByLogin(login));
        return "all-flashcards";
    }

    @GetMapping("/all-flashcard-sets")
    public String allFlashcardSets(Map<String, Object> model, Authentication authentication){
        String login = authentication.getName();
        List<FlashcardDto> userFlashcards=flashcardService.findAllByLogin(login);
        Set<String> listNameSet = new HashSet<>();

        for(FlashcardDto flashcardDto : userFlashcards) {
            listNameSet.add(flashcardDto.getListName());
        }
        model.put("listName", listNameSet);

        return "all-flashcard-sets";
    }

    @GetMapping("/one-flashcard-set")
    public String flashcardSet(Map<String, Object> model,@RequestParam("listName") String listName, Authentication authentication){
        String login = authentication.getName();
        List<FlashcardDto> flashcardSet = flashcardService.findByLoginAndListName(login, listName);
        model.put("flashcards", flashcardSet);
        Long minIdFromUserList = flashcardRepository.findMinIdFlashcardByUserAndListName(login, listName);
        model.put("id", minIdFromUserList);
        return "one-flashcard-set";
    }


    @GetMapping("/default-flashcards")
    public String defaultFlashcards(){
        return "default-flashcards";
    }

    @GetMapping("/single-flashcard/{id}")
    public String singleFlashcard(@PathVariable Long id, Map<String, Object> model, Authentication authentication){
        FlashcardDto singleFlashcard = flashcardService.findById(id);
        model.put("flashcard", singleFlashcard);
        String login = authentication.getName();
        String listName = singleFlashcard.getListName();
        Long currentId = flashcardRepository.findNextIdFlashcardByUserAndListName(login, listName, id);
        model.put("currentId", currentId);
        return "single-flashcard";
    }
}
