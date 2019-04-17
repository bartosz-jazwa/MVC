package com.jazwa.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/scieszkaDoWidoku")
    String pokazWidok(){
        return "widok";
    }
    @GetMapping("/wiadomosc")
    String wiadomosc(Model model){
        model.addAttribute("message","cokolwiek");
        return "msgWidok";
    }
    /*@GetMapping("/wiadomosc/{tresc}")
    String wiadomoscZmienna(Model model, @PathVariable("tresc") String s){
        model.addAttribute("message",s);
        return "msgWidok";
    }*/
    @GetMapping("/wiadomosc/{tresc}")
    String wiadomoscParam(Model model,
                            @PathVariable("tresc") String s,
                            @RequestParam("imie") String i){
        model.addAttribute("message",s);
        model.addAttribute("parametr",i);
        return "msgWidok";
    }

    @GetMapping("/zaloguj")
    String zaloguj(){
        return "formularz";
    }
    @PostMapping("/wynik")
    String wynikFormularz(@RequestParam ("imie") String i,
                          @RequestParam ("nazwisko") String n,
                          Model model){
        model.addAttribute("nazwisko",n);
        return "wynik";
    }

    @GetMapping("/dodaj")
    String dodaj(Model model){
        model.addAttribute("user",new User());
        return "dodajUzytkownika";
    }

    @PostMapping("/zatwierdz")
    String submit(@ModelAttribute("user") User u,
                  Model model){
        Long id = u.getId();
        model.addAttribute("user",u);
        return "widokWynikowy";
    }
}
