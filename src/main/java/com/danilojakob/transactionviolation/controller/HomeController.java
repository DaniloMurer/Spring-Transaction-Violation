package com.danilojakob.transactionviolation.controller;

import com.danilojakob.transactionviolation.service.KisteService;
import com.danilojakob.transactionviolation.service.RegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private KisteService kisteService;
    @Autowired
    private RegalService regalService;

    @GetMapping("/")
    public ModelAndView index() {
        long kisteEntries = kisteService.countEntries();
        long regalEntries = regalService.countEntries();
        ModelAndView homeView = new ModelAndView("home");
        homeView.addObject("message", "Lager Manager");
        homeView.addObject("kisteEntries", kisteEntries);
        homeView.addObject("regalEntries", regalEntries);
        return homeView;
    }
}
