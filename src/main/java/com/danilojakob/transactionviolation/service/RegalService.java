package com.danilojakob.transactionviolation.service;

import com.danilojakob.transactionviolation.domain.Regal;
import com.danilojakob.transactionviolation.repository.RegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
