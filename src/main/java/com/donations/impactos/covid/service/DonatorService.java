package com.donations.impactos.covid.service;

import com.donations.impactos.covid.model.Donator;
import com.donations.impactos.covid.repository.DonatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonatorService {
    private final DonatorRepository donatorRepository;

    public Donator save(Donator donator){
        return donatorRepository.save(donator);
    }

    public Donator deleteById(int id){
        return donatorRepository.deleteById(id);
    }

    public Donator findById(int id){
        return donatorRepository.findById(id);
    }
}
