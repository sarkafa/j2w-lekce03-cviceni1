package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Adress;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView result = new ModelAndView("card");

        Person person = new Person();
        person.setGivenName("Eliška");
        person.setSurname("Bramborová");
        person.setPhotosURL("https://thispersondoesnotexist.com/");
        person.setBirthDate(LocalDate.of(1900, 5, 15));

        Adress adress = new Adress();
        adress.setCity("Praha");
        adress.setPsc("140 00");
        adress.setStreet("U Botiče");

        result.addObject("person", person);
        result.addObject("adress", adress);

        return result;
    }

}
