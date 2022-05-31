package com.donations.impactos.covid.controller;

import com.donations.impactos.covid.model.ONG;
import com.donations.impactos.covid.service.OngService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("api/ong")
public class OngController {

    private final OngService ongService;

    @GetMapping("/{id}")
    public ONG getOngById(@PathVariable int id){
        return ongService.findById(id);
    }

    @PostMapping
    public ONG create(@RequestBody ONG ong){
        return ongService.save(ong);
    }

    @PutMapping("/update/{id}")
    public ONG update(@PathVariable int id, @Valid @RequestBody ONG ongDetails){
        ONG ong = ongService.findById(id);

        if (ongDetails.getCnpj() != "") {
            ong.setCnpj(ongDetails.getCnpj());
        } else {
            ong.setCnpj(ong.getCnpj());
        }
        if (ongDetails.getBankAccount() != "") {
            ong.setBankAccount(ongDetails.getBankAccount());
        }
        if (ongDetails.getAddress() != "") {
            ong.setAddress(ongDetails.getAddress());
        }
        if (ongDetails.getName() != "") {
            ong.setName(ongDetails.getName());
        }
        if (ongDetails.getUsername() != "") {
            ong.setUsername(ongDetails.getUsername());
        }
        if (ongDetails.getPassword() != "") {
            ong.setPassword(ongDetails.getPassword());
        }
        if (ongDetails.getTelephone() != "") {
            ong.setTelephone(ongDetails.getTelephone());
        }

        return ongService.save(ong);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        ONG ong = ongService.findById(id);
        ongService.deleteById(ong.getId());
        return "Usuário " + id + " foi deletado";
    }

}
