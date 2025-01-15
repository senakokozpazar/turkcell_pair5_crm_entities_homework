package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="segmentation_type")
public class Segmentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "segmentation")
    private List<Customer> customers;

    @OneToMany(mappedBy = "segmentation")
    private List<Campaign> campaigns;
}
