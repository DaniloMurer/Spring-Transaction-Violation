package com.danilojakob.transactionviolation.service;

import com.danilojakob.transactionviolation.domain.Kiste;
import com.danilojakob.transactionviolation.repository.KisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class KisteService {

    @Autowired
    private KisteRepository kisteRepository;

    public long countEntries() {
        return kisteRepository.count();
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Kiste> findAll() {
        return kisteRepository.findAll();
    }

    public void save(Kiste kiste) {
        kisteRepository.saveAndFlush(kiste);
    }
}
