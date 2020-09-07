package com.danilojakob.transactionviolation.controller;

import com.danilojakob.transactionviolation.domain.Kiste;
import com.danilojakob.transactionviolation.service.KisteService;
import com.danilojakob.transactionviolation.service.RegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kiste")
public class KisteController {

    @Autowired
    private KisteService kisteService;
    @Autowired
    private RegalService regalService;

    @GetMapping
    public ResponseEntity<List<Kiste>> get() {
        return ResponseEntity.status(HttpStatus.OK).body(kisteService.findAll());
    }

    @PostMapping
    public ResponseEntity<HttpStatus> add(@Validated @RequestBody Kiste kiste) {
        kiste.setRegal(regalService.findById(kiste.getRegal().getLagerId()));
        kisteService.save(kiste);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@Validated @RequestBody Kiste kiste) {
        if (kiste.getKisteId() == 0) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("For Update a Id must be provided");
        }
        kisteService.updateKiste(kiste);
        return new ResponseEntity(HttpStatus.OK);
    }
}
