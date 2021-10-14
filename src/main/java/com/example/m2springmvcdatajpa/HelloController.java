package com.example.m2springmvcdatajpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping ("/hola")
    public String holaMundo (Model model) {
        model.addAttribute("mensaje","¿Cómo están Ustedes?");
        return "hola"; // Nombre del archivo html
    }

}
