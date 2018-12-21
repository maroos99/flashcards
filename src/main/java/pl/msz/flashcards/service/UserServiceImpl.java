package pl.msz.flashcards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.msz.flashcards.converter.UserConverter;
import pl.msz.flashcards.dto.UserRegistrationDto;
import pl.msz.flashcards.model.User;
import pl.msz.flashcards.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;


    @Override
    public void registerUser(UserRegistrationDto userRegistrationDto) {
        User user = userConverter.convert(userRegistrationDto);
        userRepository.save(user);
    }

    @Override
    public boolean authenticate(String login, String password) {
        return userRepository.findOneByLoginAndPassword(login, password) != null;
    }
}
