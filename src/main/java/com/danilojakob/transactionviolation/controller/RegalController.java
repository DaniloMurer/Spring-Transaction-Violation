package com.danilojakob.transactionviolation.controller;

import com.danilojakob.transactionviolation.service.RegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/regal")
public class RegalController {

    @Autowired
    private RegalService regalService_;

    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("test");
    }
}
