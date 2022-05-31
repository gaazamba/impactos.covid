package com.donations.impactos.covid.service;

import com.donations.impactos.covid.model.Donation;
import com.donations.impactos.covid.repository.DonationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public Donation save(Donation donation){
        return donationRepository.save(donation);
    }

    public Donation findById(int id){
        return donationRepository.findById(id);
    }
}
