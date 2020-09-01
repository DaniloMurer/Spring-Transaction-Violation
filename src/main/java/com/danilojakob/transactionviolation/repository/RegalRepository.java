package com.danilojakob.transactionviolation.repository;

import com.danilojakob.transactionviolation.domain.Regal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegalRepository extends JpaRepository<Regal, Long> {
}
