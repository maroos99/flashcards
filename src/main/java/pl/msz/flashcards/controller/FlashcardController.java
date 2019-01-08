package pl.msz.flashcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.msz.flashcards.service.FlashcardService;

import java.util.Map;

@Controller
public class FlashcardController {

    @Autowired
    private FlashcardService flashcardService;


    @GetMapping("/all-flashcards")
    public String allFlashcards(Map<String, Object> model){
        model.put("flashcards", flashcardService.findAll());
        return "all-flashcards";
    }

    @GetMapping("/all-flashcard-sets")
    public String allFlashcardSets(){
        return "all-flashcard-sets";
    }

    @GetMapping("/default-flashcards")
    public String defaultFlashcards(){
        return "default-flashcards";
    }
}
