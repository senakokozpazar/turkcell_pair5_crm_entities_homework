package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "individual_customers")
public class IndividualCustomer extends Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_no")
    private String idNo;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

}
