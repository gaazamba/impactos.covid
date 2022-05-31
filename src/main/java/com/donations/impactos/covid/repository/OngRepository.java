package com.donations.impactos.covid.repository;

import com.donations.impactos.covid.model.ONG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<ONG, Integer> {
    ONG findById(int id);
    ONG deleteById(int id);
    ONG save(ONG ong);
}


