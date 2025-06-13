package projetoFinal.steamRoxa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String ola(){
        return "Olá Mundo!";
    }
}
