package com.donations.impactos.covid.repository;

import com.donations.impactos.covid.model.Donator;
import com.donations.impactos.covid.model.ONG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonatorRepository extends JpaRepository<Donator, Integer> {
    Donator findById(int id);
    Donator deleteById(int id);
    Donator save(Donator donator);
}
