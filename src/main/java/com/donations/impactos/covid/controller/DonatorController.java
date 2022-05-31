package com.donations.impactos.covid.controller;

import com.donations.impactos.covid.model.Donator;
import com.donations.impactos.covid.model.ONG;
import com.donations.impactos.covid.service.DonatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("api/donator")
public class DonatorController {

    private final DonatorService donatorService;

    @GetMapping("/{id}")
    public Donator getDonatorById(@PathVariable int id){
        return donatorService.findById(id);
    }

    @PostMapping
    public Donator create(@RequestBody Donator donator){
        return donatorService.save(donator);
    }

    @PutMapping("/update/{id}")
    public Donator update(@PathVariable int id, @Valid @RequestBody Donator donatorDetails){
        Donator donator = donatorService.findById(id);

        if (donatorDetails.getCpf() != "") {
            donator.setCpf(donatorDetails.getCpf());
        } else {
            donator.setCpf(donator.getCpf());
        }
        if (donatorDetails.getRg() != "") {
            donator.setRg(donatorDetails.getRg());
        } else {
            donator.setRg(donator.getCpf());
        }
        if (donatorDetails.getBankAccount() != "") {
            donator.setBankAccount(donatorDetails.getBankAccount());
        }
        if (donatorDetails.getAddress() != "") {
            donator.setAddress(donatorDetails.getAddress());
        }
        if (donatorDetails.getName() != "") {
            donator.setName(donatorDetails.getName());
        }
        if (donatorDetails.getUsername() != "") {
            donator.setUsername(donatorDetails.getUsername());
        }
        if (donatorDetails.getPassword() != "") {
            donator.setPassword(donatorDetails.getPassword());
        }
        if (donatorDetails.getTelephone() != "") {
            donator.setTelephone(donatorDetails.getTelephone());
        }

        return donatorService.save(donator);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        Donator donator = donatorService.findById(id);
        donatorService.deleteById(donator.getId());
        return "Usuário " + id + " foi deletado";
    }

}
