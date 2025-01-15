package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "corporate_customers")
public class CorporateCustomer extends Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "tax_no")
    private String taxNo;
}
