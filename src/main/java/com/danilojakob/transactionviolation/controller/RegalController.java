package com.danilojakob.transactionviolation.controller;

import com.danilojakob.transactionviolation.domain.Regal;
import com.danilojakob.transactionviolation.service.RegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public ResponseEntity<HttpStatus> create(@Validated @RequestBody Regal regal) {
        regalService_.createRegal(regal);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping
    public ResponseEntity update(@Validated @RequestBody Regal regal) {
        if (regal.getLagerId() == 0) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("For Update a Id must be provided");
        }
        regalService_.updateRegal(regal);
        return new ResponseEntity(HttpStatus.OK);
    }
}
