package com.danilojakob.transactionviolation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView homeView = new ModelAndView("home");
        homeView.addObject("message", "Lager Manager");
        return homeView;
    }
}
