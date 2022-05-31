package com.donations.impactos.covid.repository;

import com.donations.impactos.covid.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer> {
    Donation save(Donation donation);
    Donation findById(int i);
}
