package com.danilojakob.transactionviolation.repository;

import com.danilojakob.transactionviolation.domain.Kiste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisteRepository extends JpaRepository<Kiste, Long> {
}
