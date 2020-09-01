package com.danilojakob.transactionviolation.service;

import com.danilojakob.transactionviolation.repository.KisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisteService {

    @Autowired
    private KisteRepository kisteRepository;

    public long countEntries() {
        return kisteRepository.count();
    }
}
