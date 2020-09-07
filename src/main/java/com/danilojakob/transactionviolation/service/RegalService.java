package com.danilojakob.transactionviolation.service;

import com.danilojakob.transactionviolation.domain.Regal;
import com.danilojakob.transactionviolation.repository.RegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegalService {

    @Autowired
    private RegalRepository regalRepository;

    /**
     * Count amount of regal entries
     * @return amount of entries
     */
    public long countEntries() {
        return regalRepository.count();
    }

    public List<Regal> findAll() {
        return regalRepository.findAll();
    }

    public Regal findById(Long id) {
        Optional<Regal> optionalRegal = regalRepository.findById(id);
        return optionalRegal.orElse(null);
    }

    public void createRegal(Regal regal) {
        regalRepository.saveAndFlush(regal);
    }

    public void updateRegal(Regal regal) {
        regalRepository.saveAndFlush(regal);
    }
}
