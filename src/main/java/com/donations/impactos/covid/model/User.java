package com.donations.impactos.covid.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true)
    private String username;
    private String password;
    private String name;
    private String address;
    private String telephone;
    private String bankAccount;

}
