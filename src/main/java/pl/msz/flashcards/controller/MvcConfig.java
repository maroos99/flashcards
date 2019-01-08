package pl.msz.flashcards.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/logged-user").setViewName("logged-user");
        registry.addViewController("/all-flashcards-lists").setViewName("all-flashcards");
        registry.addViewController("/all-lists-flashcards").setViewName("all-flashcard-sets");
    }
}
