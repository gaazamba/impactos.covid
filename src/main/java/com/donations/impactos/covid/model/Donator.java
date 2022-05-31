package com.donations.impactos.covid.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Donator extends User{

    @Column(unique=true)
    private String cpf;

    @Column(unique=true)
    private String rg;

}
