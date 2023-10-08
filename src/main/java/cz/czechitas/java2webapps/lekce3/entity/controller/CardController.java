package cz.czechitas.java2webapps.lekce3.entity.controller;

import cz.czechitas.java2webapps.lekce3.entity.Adress;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    @GetMapping("/")
   public ModelAndView index(){
       ModelAndView result = new ModelAndView("card");
          Adress adress = new Adress("Vojanova","400","Praha","140 02");
          Person person = new Person("Eliška","Krásnohorská","eliska@krasnohorska.cz"
                  ,LocalDate.of(1945,11,18),"https://thispersondoesnotexist.com/",adress);

       result.addObject("person",person);
       //result.addObject("adresa",adresa);

        return result;
   }
}
