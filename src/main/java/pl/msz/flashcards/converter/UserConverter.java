package pl.msz.flashcards.converter;

import pl.msz.flashcards.dto.UserRegistrationDto;
import pl.msz.flashcards.model.User;

public interface UserConverter {

    User convert(UserRegistrationDto userRegistrationDto);

}
