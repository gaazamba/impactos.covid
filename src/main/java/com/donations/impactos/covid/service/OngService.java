package com.donations.impactos.covid.service;

import com.donations.impactos.covid.model.ONG;
import com.donations.impactos.covid.repository.OngRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OngService {
    private final OngRepository ongRepository;

    public ONG save(ONG ong){
        return ongRepository.save(ong);
    }

    public ONG deleteById(int id){
        return ongRepository.deleteById(id);
    }

    public ONG findById(int id){
        return ongRepository.findById(id);
    }

}
