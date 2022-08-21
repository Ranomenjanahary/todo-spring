package com.example.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    /**
     *Transit vers le formulaire de connexion.
     */
    @RequestMapping("/login")
    public String showLoginForm(Model model) {

        //Transition vers l'écran de connexion.
        return "Login";
    }

    /**
     *Accédez à la page principale.
     *Si la connexion réussit, cette méthode sera appelée.
     */
    @RequestMapping("/")
    public String login(Model model) {

        //Page d'accueil.
        return "index";
    }

}
