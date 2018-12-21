package pl.msz.flashcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.msz.flashcards.dto.UserRegistrationDto;
import pl.msz.flashcards.service.UserService;

import java.util.Locale;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String userLogin(){
        return "login";
    }

    @GetMapping("/registration")
    public String userRegistration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String registerCustomer(@ModelAttribute("userModel") @Validated UserRegistrationDto userRegistrationDto, BindingResult result,
                                   Map<String, Object> model) {
        model.put("userModel", userRegistrationDto);
        if (result.hasErrors()) {
            return "registration";
        }
        userService.registerUser(userRegistrationDto);

        return "home";
    }
}
