package com.example.Test.controllers;


import com.example.Test.entities.User;
import com.example.Test.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/registration")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping
    public String showRegPage(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user, Model model) {
        model.addAttribute("user", new User());
        return "redirect:/";
    }
}



