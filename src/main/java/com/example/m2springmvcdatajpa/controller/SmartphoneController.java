package com.example.m2springmvcdatajpa.controller;

import com.example.m2springmvcdatajpa.entities.Smartphone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SmartphoneController {

    @GetMapping ("/smartphone/show")
    public String showSmartphone (Model model) {
        Smartphone smartphone1 = new Smartphone(1L,8, "Samsung Galaxy",450d);
        Smartphone smartphone2 = new Smartphone(2L,16, "One Plus 9",850d);
        model.addAttribute("samsung",smartphone1);
        model.addAttribute("oneplus",smartphone2);
        return "smartphone-view";
    }

    @GetMapping ("/smartphone")
    public String findAll (Model model) {
        List<Smartphone> smartphones = new ArrayList<>();
        Smartphone smartphone1 = new Smartphone(1L,8, "Samsung Galaxy",450d);
        Smartphone smartphone2 = new Smartphone(2L,16, "One Plus 9",850d);
        Smartphone smartphone3 = new Smartphone(3L,8, "Iphone X",1250d);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        model.addAttribute("smartphones", smartphones);

        return "smartphone-list";
    }



}
