package pl.msz.flashcards.dto;

import javax.persistence.Id;
import javax.validation.constraints.*;

public class UserRegistrationDto {

    @Id
    private Long id;

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
    @Min(value = 7, message = "Age should not be less than 7")
    @Max(value = 120, message = "Age should not be greater than 120")
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
