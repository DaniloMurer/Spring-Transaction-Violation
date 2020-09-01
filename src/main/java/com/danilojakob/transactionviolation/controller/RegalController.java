package com.danilojakob.transactionviolation.controller;

import com.danilojakob.transactionviolation.domain.Regal;
import com.danilojakob.transactionviolation.service.RegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/regal")
public class RegalController {

    @Autowired
    private RegalService regalService_;

    @GetMapping
    public ResponseEntity<List<Regal>> get() {
        return ResponseEntity.status(HttpStatus.OK).body(regalService_.findAll());
    }
}
