package com.donations.impactos.covid.controller;

import com.donations.impactos.covid.model.Donation;
import com.donations.impactos.covid.service.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/donation")
public class DonationController {
    private final DonationService donationService;

    @GetMapping("/{id}")
    public Donation getDonationById(@PathVariable int id){
        return donationService.findById(id);
    }

    @PostMapping("/donate")
    public Donation donate(@RequestBody Donation donation){
        return donationService.save(donation);
    }

}
