package pl.msz.flashcards.service;

import pl.msz.flashcards.dto.UserRegistrationDto;

public interface UserService {

    void registerUser(UserRegistrationDto userRegistrationDto);

    boolean authenticate(String login, String password);
}
