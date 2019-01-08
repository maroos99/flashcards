package pl.msz.flashcards.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import pl.msz.flashcards.dto.UserRegistrationDto;
import pl.msz.flashcards.model.User;

@Component
public class UserConverterImpl implements UserConverter{

    @Override
    public User convert(UserRegistrationDto userRegistrationDto) {
        User user = new User();
        user.setLogin(userRegistrationDto.getLogin());
//        user.setPassword(userRegistrationDto.getPassword());  //plain text bez szyfrowania
       user.setPassword(DigestUtils.md5DigestAsHex(userRegistrationDto.getPassword().getBytes()));   //szyfrowanie
        user.setEmail(userRegistrationDto.getEmail());
        user.setName(userRegistrationDto.getName());
        user.setAge(userRegistrationDto.getAge());
        user.setId(userRegistrationDto.getId());

        return user;
    }


}
