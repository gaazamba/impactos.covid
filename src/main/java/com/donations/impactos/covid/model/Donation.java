package com.donations.impactos.covid.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity

public class Donation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float amount;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "donator_id")
    private Donator donator;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "ong_id")
    private  ONG Ong;
}
