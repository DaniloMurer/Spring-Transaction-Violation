package com.danilojakob.transactionviolation.service;

import com.danilojakob.transactionviolation.repository.RegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
