package pl.msz.flashcards.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class UserLoginDto {

    @NotNull(message = "You must enter the login")
    private String login;

    @NotNull(message = "You must enter the password")
    private String password;


    public UserLoginDto() {
    }


}
