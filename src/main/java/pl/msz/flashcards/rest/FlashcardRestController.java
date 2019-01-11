package pl.msz.flashcards.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.msz.flashcards.dto.FlashcardDto;
import pl.msz.flashcards.service.FlashcardService;

@RestController
public class FlashcardRestController {

    @Autowired
    private FlashcardService flashcardService;

    @RequestMapping("/single-flashcard/{id}/{status}")
    public String changeStatus(@PathVariable Long id,@PathVariable Boolean status) {
        FlashcardDto flashcardDto =flashcardService.findById(id);
        flashcardDto.setLearned(true);
        flashcardService.save(flashcardDto);
        return "OK";
    }
}
