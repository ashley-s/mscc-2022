package com.example.msccspringtesting.infrastructure.adapters.output.persistence.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "accounts")
@Data
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountNumber;
    private double currentBalance;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
}
