package com.example.Test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MpController {

    @GetMapping("/")
    public String showMp(Model model) {
        model.addAttribute("title", "Главная страница");
        return "mp";
    }


}