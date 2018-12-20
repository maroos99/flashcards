package pl.msz.flashcards.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegistrationDto {

    @NotNull(message = "Login can't be empty")
    @Size(min = 4, max = 25, message = "Login must include from 4 to 25 characters")
    private String login;

    @NotNull(message = "Password can't be empty")
    private String password;

    @NotNull(message = "Repeated password can't be empty")
    private String repeatedPassword;

    @NotNull(message = "Name can't be empty")
    private String name;

    @Email(message = "Email can't be valid")
    private String email;

    @NotNull(message = "Age can't be empty")
    private int age;

    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String login, String password, String repeatedPassword, String name, String email, int age) {
        this.login = login;
        this.password = password;
        this.repeatedPassword = repeatedPassword;
        this.name = name;
        this.email = email;
        this.age = age;
    }


}
