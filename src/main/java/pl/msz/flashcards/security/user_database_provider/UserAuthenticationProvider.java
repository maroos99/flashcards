package pl.msz.flashcards.security.user_database_provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import pl.msz.flashcards.service.UserService;

import java.util.ArrayList;

@Component
public class UserAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
  //      String password = authentication.getCredentials().toString();   //plain text bez hashowania
        String password = DigestUtils.md5DigestAsHex(authentication.getCredentials().toString().getBytes());

        if(userService.authenticate(login, password)){

            return new UsernamePasswordAuthenticationToken(
                    login, password, new ArrayList<>());

        } else {
            return null;
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
                UsernamePasswordAuthenticationToken.class);
    }
}
